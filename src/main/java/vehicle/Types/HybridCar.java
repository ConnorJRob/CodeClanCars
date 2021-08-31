package vehicle.Types;

import vehicle.Vehicle;
import vehicleComponents.Brakes;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;

public class HybridCar extends Vehicle {

    public HybridCar(Tyres tyres, Engine engine, Brakes brakes, double price) {
        super(tyres, engine, brakes, price);
    }
}
