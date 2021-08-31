package Stakeholders;

import vehicle.Types.DieselCar;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    private double funds;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double funds) {
        this.funds = funds;
        this.ownedVehicles = new ArrayList<>();
    }

    public void takeOwnershipOfVehicle(Vehicle vehicle) {
        this.ownedVehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public double getFunds() {
        return funds;
    }

    public void buyVehicle(Vehicle vehicle) {
        this.funds -= vehicle.getPrice();
        takeOwnershipOfVehicle(vehicle);
    }
}
