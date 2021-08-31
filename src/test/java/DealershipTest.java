import Stakeholders.Customer;
import Stakeholders.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicle.Types.DieselCar;
import vehicle.Types.ElectricCar;
import vehicleComponents.Brakes;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private DieselCar dieselCar;
    private ElectricCar electricCar;
    private Tyres tyres;
    private Engine engine;
    private Brakes brakes;
    private Customer customer;

    @Before
    public void before() {
        tyres = new Tyres("Michelin");
        engine = new Engine("V7");
        brakes = new Brakes("Ceramic");
        dieselCar = new DieselCar(tyres, engine, brakes, 15000);
        dealership = new Dealership(50000);
        customer = new Customer(75000);
    }

    @Test
    public void dealershipCanAddCarsToStock(){
        dealership.addVehicleToStock(dieselCar);
        assertEquals(1, dealership.getVehiclesInStock().size());
        }

    @Test
    public void dealershipCanBuyVehicle(){
        dealership.buyVehicle(dieselCar);
        assertEquals(35000, dealership.getTill(), 0);
        assertEquals(1, dealership.getVehiclesInStock().size());
    }

    @Test
    public void dealershipCanSellVehicleToCustomer(){
        dealership.addVehicleToStock(dieselCar);
        dealership.sellVehicleToCustomer(customer, dieselCar);
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals(60000, customer.getFunds(),0);
        assertEquals(65000, dealership.getTill(),0);
        assertEquals(0, dealership.getVehiclesInStock().size());
    }

    @Test
    public void canRepairDamagedVehicles(){
        dieselCar.damageCar(1000);
        dealership.repairDamagedVehicle(dieselCar, 1000);
        assertEquals(15000, dieselCar.getPrice(),0);
        assertEquals(49000, dealership.getTill(),0);
    }
}
