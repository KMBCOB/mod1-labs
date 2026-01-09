package librarymanagement;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addItem(new Book("The Life of Pi", "Yann Martel", 356));
        lib.addItem(new Book("A Game of Thrones", "George R. R. Martin", 694));
        lib.addItem(new Book("The Tiger Who Came To Tea", "Judith Kerr", 32));
        lib.addItem(new Magazine("TIME Magazine", 5278));
        lib.addItem(new Magazine("HELLO!", 1377));

        User user = new User("Owen");

        try {
            lib.borrowItemById(0, user);
            lib.borrowItemById(0, user);
            lib.returnItemById(0, user);
            lib.returnItemById(0, user);
            lib.borrowItemById(1, user);
            lib.borrowItemById(2, user);
            lib.borrowItemById(3, user);
            lib.borrowItemById(4, user);
            lib.borrowItemById(5, user);
        } catch(ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
