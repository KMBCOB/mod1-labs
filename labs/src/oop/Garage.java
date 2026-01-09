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

    public Vehicle findVehicleById(int id) throws VehicleNotFoundException {
        for(Vehicle v : vehicles) {
            if (v.getId() == id) { return v; }
        }
        throw new VehicleNotFoundException("Vehicle cannot be found.");
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

    public void calculateTotalBill() {
        for(Vehicle v : vehicles) {
            v.calcBill();
        }
    }

    public void calculateBillById(int id) {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                v.calcBill();
                break;
            }
        }
    }

    public Vehicle removeVehicleById(int id) throws VehicleNotFoundException {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                vehicles.remove(v);
                return v;
            }
        }
        throw new VehicleNotFoundException(String.format("Vehicle with id %d not found", id));
    }
}

class VehicleNotFoundException extends Exception {
    public VehicleNotFoundException(String message) {
        super(message);
    }
}