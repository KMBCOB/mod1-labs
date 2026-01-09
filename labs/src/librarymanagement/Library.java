package librarymanagement;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem> libraryitems;

    public Library() {
        libraryitems = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        libraryitems.add(item);
    }

    public void listLibraryItems() {
        for(LibraryItem item : libraryitems) {
            System.out.println(item.toString());
        }
    }

    public ArrayList<LibraryItem> findByTitle(String title) throws ItemNotFoundException {
        ArrayList<LibraryItem> results = new ArrayList<>();
        for(LibraryItem item : libraryitems) {
            if (item.getTitle().contains(title)) { results.add(item); }
        }
        if (results.isEmpty()) {
            throw new ItemNotFoundException(String.format("No books with title matching \"%s\" found.", title));
        } else {
            return results;
        }
    }

    public ArrayList<LibraryItem> findAvailableItems() {
        ArrayList<LibraryItem> results = new ArrayList<>();
        for(LibraryItem item : libraryitems) { if (!item.getIsBorrowed()) { results.add(item); }}
        return results;
    }

    public ArrayList<LibraryItem> findBorrowedItems() {
        ArrayList<LibraryItem> results = new ArrayList<>();
        for(LibraryItem item : libraryitems) { if (item.getIsBorrowed()) { results.add(item); }}
        return results;
    }

    public void borrowItemById(int id, User user) throws ItemNotFoundException {
        for(LibraryItem item : libraryitems) {
            if (item.getId() == id) {
                try {
                    item.borrowItem(user);
                    return;
                } catch(BorrowedItemException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        throw new ItemNotFoundException(String.format("Item with id %d not found.", id));
    }

    public void returnItemById(int id, User user) throws ItemNotFoundException {
        for(LibraryItem item : libraryitems) {
            if (item.getId() == id) {
                item.returnItem(user);
                return;
            }
        }
        throw new ItemNotFoundException(String.format("Item with id %d not found.", id));
    }
}

class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}
