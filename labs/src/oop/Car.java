package oop;

public class Car extends Vehicle{
    int doors;
    FuelType fuelType;

    public Car(int wheels, int engines, String colour, int doors, FuelType fuelType){
        super(wheels, engines, colour, true, TravelType.TERRESTRIAL);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    public int getDoors() {
        return doors;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void addFuel() {
        setHasFuel(true);
        switch (fuelType) {
            case DIESEL -> System.out.println("Diesel added.");
            case PETROL -> System.out.println("Petrol added.");
            case ELECTRIC -> System.out.println("Car charged.");
        }
    }

    @Override
    public void driveVehicle() {
        System.out.println("We're on the road!");
        setHasFuel(false);
        if (fuelType == FuelType.ELECTRIC) { System.out.println("Out of fuel - find a charging point."); }
        else { System.out.println("Out of fuel - find a petrol station."); }
    }

    @Override
    public String toString() {
        return "Car\n" +
                "ID: " + this.id + "\n" +
                "Number of wheels: " + this.wheels + "\n" +
                "Number of doors: " + this.doors + "\n" +
                "Number of engines: " + this.engines + "\n" +
                "Colour: " + this.colour + "\n" +
                "Fuel Type: " + this.fuelType.toString() + "\n" +
                "Is the car fuelled? : " + (this.hasFuel ? "Yes" : "No") + "\n";
    }
}

enum FuelType {
    PETROL,
    DIESEL,
    ELECTRIC
}