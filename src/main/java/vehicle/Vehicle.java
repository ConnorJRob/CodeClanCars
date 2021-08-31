package vehicle;

import vehicleComponents.Brakes;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;

public abstract class Vehicle {

    private Tyres tyres;
    private Engine engine;
    private Brakes brakes;
    private double price;
    private double damage;

    public Vehicle(Tyres tyres, Engine engine, Brakes brakes, double price) {
        this.tyres = tyres;
        this.engine = engine;
        this.brakes = brakes;
        this.price = price;
        this.damage = 0;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void damageCar(double damage){
        this.price -= damage;
    }
}
