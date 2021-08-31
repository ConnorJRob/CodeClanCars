import Stakeholders.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicle.Types.DieselCar;
import vehicleComponents.Brakes;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private DieselCar dieselCar;
    private Tyres tyres;
    private Engine engine;
    private Brakes brakes;
    private Customer customer;

    @Before
    public void before(){
        tyres = new Tyres("Michelin");
        engine = new Engine("V7");
        brakes = new Brakes("Ceramic");
        dieselCar = new DieselCar(tyres, engine, brakes, 15000);
        customer = new Customer(20000);
    }

    @Test
    public void customerCanOwnAVehicle(){
        customer.takeOwnershipOfVehicle(dieselCar);
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void customerCanBuyVehicle(){
        customer.buyVehicle(dieselCar);
        assertEquals(5000, customer.getFunds(), 0);
        assertEquals(1, customer.getOwnedVehicles().size());
    }
}