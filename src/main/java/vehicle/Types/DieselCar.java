package vehicle.Types;

import vehicle.Vehicle;
import vehicleComponents.Brakes;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;

public class DieselCar extends Vehicle {

    public DieselCar(Tyres tyres, Engine engine, Brakes brakes, double price) {
        super(tyres, engine, brakes, price);
    }
}
