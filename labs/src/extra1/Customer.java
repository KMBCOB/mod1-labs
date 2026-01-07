package extra1;

public class Customer {
    private String name;
    private int age;
    private boolean isVip;

    public Customer(String name, int age, boolean isVip) {
        this.name = name;
        this.age = age;
        this.isVip = isVip;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVip() {
        return isVip;
    }
}
