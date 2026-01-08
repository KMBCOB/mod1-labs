package oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addVehicle(new Car(4, 1, "Red", 4, FuelType.PETROL));
        garage.addVehicle(new Car(3, 1, "Silver", 4, FuelType.ELECTRIC));
        garage.addVehicle(new Boat(0, "Blue", true));
        garage.addVehicle(new Boat(1, "Blue", false));
        garage.addVehicle(new Plane(3, 1, "White", 4, true));

        Vehicle vehicle = garage.findVehicleById((int) (Math.random() * garage.vehicles.size()));
        System.out.println(vehicle.toString());
        vehicle.driveVehicle();
        vehicle.addFuel();
        vehicle.driveVehicle();

        Class<?>[] vehicleTypes = {Car.class, Boat.class, Plane.class};
        ArrayList<Vehicle> vlist = garage.findVehicleByType((Class<? extends Vehicle>) vehicleTypes[(int) (Math.random() * 3)]);
        for(Vehicle v : vlist) {
            System.out.println(v.toString());
        }
    }
}
