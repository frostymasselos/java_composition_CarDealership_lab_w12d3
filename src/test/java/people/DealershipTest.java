package people;

import carComponents.DieselEngine;
import carComponents.ElectricEngine;
import carComponents.HybridEngine;
import cars.*;
import org.junit.Before;
import org.junit.Test;
import people.Dealership;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    private Dealership dealership;
    private Car car;
    private ElectricCar carE;
    private HybridCar carH;
//    private DieselEngine dEngine;
    private Customer customer;

    @Before
    public void before() {

        car = new Car("Rodger", 25000.00, ColourType.GREY, new DieselEngine());
        carE = new ElectricCar( "Eugene", 30000.00, ColourType.GREEN, new ElectricEngine());
        carH = new HybridCar("Herbie", 28000.00, ColourType.RED, new HybridEngine());
        dealership = new Dealership("Arnold Clark");
        customer = new Customer(100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Arnold Clark", dealership.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(50000, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddTill(){
        dealership.addTill(50.00);
        assertEquals(50050, dealership.getTill(), 0.01);
    }

    @Test
    public void canDecreaseTill(){
        dealership.decreaseTill(50.00);
        assertEquals(49950, dealership.getTill(), 0.01);
    }

    @Test
    public void collectionStartsZero() {
        assertEquals(0, dealership.getCars().size());
        assertEquals(0, dealership.getElectricCars().size());
        assertEquals(0, dealership.getHybridCars().size());
        assertEquals(0, dealership.getAllVehicleTypes().size());
    }

    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getCars().size());
        assertEquals(1, dealership.getAllVehicleTypes().size());
        assertEquals(25000, dealership.getTill(), 0.01);
    }

    @Test
    public void canDisplayCollectionAsHashMap(){
        dealership.buyVehicle(car);
        dealership.buyVehicle(carE);
        dealership.buyVehicle(carH);
        assertEquals(3, dealership.displayAllVehicleTypes().size());
    }

    @Test
    public void canBuyCar() {
        dealership.buyVehicle(car);
        dealership.buyVehicle(carE);
        dealership.buyVehicle(carH);

        assertEquals(1, dealership.getCars().size());
        assertEquals(1, dealership.getElectricCars().size());
        assertEquals(1, dealership.getHybridCars().size());
        assertEquals(-33000.0, dealership.getTill(), 0.01);
    }

//    @Test
//    public void canSellVehicle(){
//        dealership.buyVehicle(car);
//        dealership.buyVehicle(carE);
//        dealership.buyVehicle(carH);
//        dealership.sellVehicle(carE.getName(), customer);
//        assertEquals(0, dealership.getElectricCars().size());
//    }
//


}
