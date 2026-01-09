package librarymanagement;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    public Class<? extends LibraryItem> getItemType() {
        return Magazine.class;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nIssue No: %d", title, issueNumber);
    }
}
