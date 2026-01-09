package oop;

public class Boat extends Vehicle{
    boolean hasSail;

    public Boat(int engines, String colour, boolean hasSail){
        super(0, engines, colour, !hasSail, TravelType.NAUTICAL);
        this.hasSail = hasSail;
    }

    public boolean isHasSail() {
        return hasSail;
    }

    public void setHasSail(boolean hasSail) {
        this.hasSail = hasSail;
    }

    @Override
    public void addFuel() {
        if (hasSail) { System.out.println("No fuel needed for this boat."); }
        else { System.out.println("Fuel added to boat."); }
    }

    @Override
    public void driveVehicle() {
        if (hasSail) { System.out.println("Sailing the high seas!"); }
        else {
            System.out.println("Speeding over the waves!");
            setHasFuel(false);
            System.out.println("Fuel expended - returning to port.");
        }
    }

    @Override
    public String toString() {
        return "Boat\n" +
                "ID: " + this.id + "\n" +
                "Number of engines: " + this.engines + "\n" +
                "Colour: " + this.colour + "\n" +
                "Does this boat have a sail? : " + (hasSail ? "Yes\n" : "No\n") +
                (hasSail ?
                        "" :
                        "Is the boat fuelled? :" + (hasFuel ? "Yes\n" : "No\n")) +
                "Cost : " + this.bill + "\n";
    }

    @Override
    void calcBill() {
        this.bill = this.hasSail ? 4000.00 : 5500.00;
    }
}
