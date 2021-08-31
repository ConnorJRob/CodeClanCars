import org.junit.Before;
import org.junit.Test;
import vehicle.Types.ElectricCar;
import vehicleComponents.Brakes;
import vehicleComponents.ChargingPort;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    private ElectricCar electricCar;
    private Tyres tyres;
    private Engine engine;
    private Brakes brakes;
    private ChargingPort chargingPort;

    @Before
    public void before(){
        tyres = new Tyres("Dunlop");
        engine = new Engine("EV12");
        brakes = new Brakes("Ceramic");
        chargingPort = new ChargingPort(900);
        electricCar = new ElectricCar(tyres, engine, brakes, 20000, chargingPort);
    }

    @Test
    public void canDamageCar(){
        electricCar.damageCar(2500);
        assertEquals(17500, electricCar.getPrice(),0);
    }
}
