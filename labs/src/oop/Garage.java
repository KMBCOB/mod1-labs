package oop;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle findVehicleById(int id) {
        for(Vehicle v : vehicles) {
            if (v.getId() == id) { return v; }
        }
        return null;
    }

    public ArrayList<Vehicle> findVehicleByType(Class<? extends Vehicle> vehicleType) {
        ArrayList<Vehicle> results = new ArrayList<>();
        for(Vehicle v : vehicles) {
            if (v.getClass() == vehicleType) {
                results.add(v);
            }
        }
        return results;
    }

}
