package librarymanagement;

public abstract class LibraryItem {
    private static int autonumber;

    protected int id;
    protected String title;
    protected boolean isBorrowed;

    static {
        autonumber = 0;
    }

    public LibraryItem(String title) {
        this.id = autonumber++;
        this.title = title;
        this.isBorrowed = false;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getIsBorrowed() {
        return this.isBorrowed;
    }

    public void borrowItem(User user) throws BorrowedItemException {
        if (!isBorrowed) {
            if(user.getBorrowed().size() >= user.getLimit()) {
                System.out.printf("User %s has already reached their borrowing limit(%d)", user.getName(), user.getLimit());
                return;
            }
            System.out.printf("User %s is now borrowing %s.\n", user.getName(), title);
            isBorrowed = true;
            user.borrowItem(this);
        } else {
            throw new BorrowedItemException(String.format("%s is already being borrowed.\n", title));
        }
    }

    public void returnItem(User user) {
        if (isBorrowed) {
            if(user.getBorrowed().contains(this)) {
                System.out.printf("User %s is returning %s.\n", user.getName(), title);
                isBorrowed = false;
                user.returnItem(this);
            } else {
                System.out.printf("User %s is not borrowing %s.\n", user.getName(), title);
            }
        } else {
            System.out.printf("%s is not being borrowed.\n", title);
        }
    }

    @Override
    public String toString() {
        return null;
    }

    public abstract Class<? extends LibraryItem> getItemType();
}

class BorrowedItemException extends Exception {
    public BorrowedItemException(String message) {
        super(message);
    }
}