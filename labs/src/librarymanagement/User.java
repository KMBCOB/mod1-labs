package librarymanagement;

import java.util.ArrayList;

public class User {
    private static int autonumber;

    private int id;
    private int limit;
    private String name;
    private ArrayList<LibraryItem> borrowed;

    static {
        autonumber = 0;
    }

    public User(String name) {
        this.id = autonumber++;
        this.limit = 3;
        this.name = name;
        this.borrowed = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    public ArrayList<LibraryItem> getBorrowed() {
        return borrowed;
    }

    public void borrowItem(LibraryItem item) {
        this.borrowed.add(item);
    };

    public void returnItem(LibraryItem item) {
        this.borrowed.remove(item);
    }
}
