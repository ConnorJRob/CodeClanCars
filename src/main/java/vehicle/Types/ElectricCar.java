package vehicle.Types;

import vehicle.Vehicle;
import vehicleComponents.Brakes;
import vehicleComponents.ChargingPort;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;

public class ElectricCar extends Vehicle {

    private ChargingPort chargingPort;

    public ElectricCar(Tyres tyres, Engine engine, Brakes brakes, double price, ChargingPort chargingPort) {
        super(tyres, engine, brakes, price);
        this.chargingPort = chargingPort;
    }

    public ChargingPort getChargingPort() {
        return chargingPort;
    }

    public void setChargingPort(ChargingPort chargingPort) {
        this.chargingPort = chargingPort;
    }
}
