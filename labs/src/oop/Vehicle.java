package oop;

public class Vehicle {
    private static int autonumber;

    static {
        autonumber = 0;
    }

    protected int id;
    protected int wheels;
    protected int engines;
    protected String colour;
    protected boolean hasFuel;
    protected TravelType travelType;

    public Vehicle(int wheels, int engines, String colour, boolean hasFuel, TravelType travelType) {
        this.id = autonumber++;
        this.wheels = wheels;
        this.engines = engines;
        this.colour = colour;
        this.hasFuel = hasFuel;
        this.travelType = travelType;
    }

    public int getId() {
        return id;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngines() {
        return engines;
    }

    public String getColour() {
        return colour;
    }

    public boolean getHasFuel() {
        return hasFuel;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHasFuel(boolean hasFuel) {
        this.hasFuel = hasFuel;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public void addFuel() {
        setHasFuel(true);
        System.out.println("Fuel added.");
    }

    public void driveVehicle() {
        if (getHasFuel()) {
            System.out.println("On the move!");
            setHasFuel(false);
            System.out.println("Out of fuel.");
        } else {
            System.out.println("Refuel needed.");
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", wheels=" + wheels +
                ", engines=" + engines +
                ", colour='" + colour + '\'' +
                ", hasFuel=" + hasFuel +
                ", travelType=" + travelType +
                '}';
    }
}

enum TravelType {
    TERRESTRIAL,
    AERIAL,
    NAUTICAL
}
