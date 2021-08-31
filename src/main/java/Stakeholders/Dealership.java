package Stakeholders;

import vehicle.Types.DieselCar;
import vehicle.Types.ElectricCar;
import vehicle.Types.HybridCar;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> vehiclesInStock;

    public Dealership(double till) {
        this.till = till;
        this.vehiclesInStock = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Vehicle> getVehiclesInStock() {
        return vehiclesInStock;
    }

    public void setVehiclesInStock(ArrayList<Vehicle> vehiclesInStock) {
        this.vehiclesInStock = vehiclesInStock;
    }

    public void addVehicleToStock(Vehicle vehicle){
        vehiclesInStock.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        this.till -= vehicle.getPrice();
        addVehicleToStock(vehicle);
    }

    public void sellVehicleToCustomer(Customer customer, Vehicle vehicle) {
        customer.buyVehicle(vehicle);
        this.till += vehicle.getPrice();
        vehiclesInStock.remove(vehicle);
    }

    public void repairDamagedVehicle(Vehicle vehicle, double damageValue) {
        vehicle.setPrice(vehicle.getPrice() + damageValue);
        this.till -= damageValue;
    }
}
