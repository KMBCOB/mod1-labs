package lab14;

public class Customer {
    static int autonumber;

    static {
        autonumber = 0;
    }

    private int id;
    private int age;
    private String name;
    private String city;

    public Customer(int age, String name, String city) {
        this.id = autonumber++;
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
