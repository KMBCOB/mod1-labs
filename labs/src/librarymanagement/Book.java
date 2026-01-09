package librarymanagement;

public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        super(title);
        this.author = author;
        this.pages = pages;
    }

    public Class<? extends LibraryItem> getItemType() {
        return Book.class;
    }

    public String getDescription() {
        return String.format("Title: %s\nAuthor: %s\nLength: %d pages", title, author, pages);
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nLength: %d pages", title, author, pages);
    }
}
