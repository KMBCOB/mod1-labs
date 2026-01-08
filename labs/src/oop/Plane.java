package oop;

public class Plane extends Vehicle{
    int wings;
    boolean hasPropeller;

    public Plane(int wheels, int engines, String colour, int wings, boolean hasPropeller) {
        super(wheels, engines, colour, true, TravelType.AERIAL);
        this.wings = wings;
        this.hasPropeller = hasPropeller;
    }

    public int getWings() {
        return wings;
    }

    public boolean isHasPropeller() {
        return hasPropeller;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    @Override
    public void addFuel() {
        setHasFuel(true);
        System.out.println("Plane has been fuelled.");
    }

    @Override
    public void driveVehicle() {
        System.out.println("Taking off!");
        setHasFuel(false);
        System.out.println("Fuel exhausted, landing on runway.");
    }

    @Override
    public String toString() {
        return "Plane\n" +
                "ID: " + this.id + "\n" +
                "Number of wheels: " + this.wheels + "\n" +
                "Number of wings: " + this.wheels + "\n" +
                "Number of engines: " + this.engines + "\n" +
                "Colour: " + this.colour + "\n" +
                "Does this plane have a propeller? : " + (this.hasPropeller ? "Yes" : "No") + "\n" +
                "Is the plane fuelled? : " + (this.hasFuel ? "Yes" : "No") + "\n";
    }
}
