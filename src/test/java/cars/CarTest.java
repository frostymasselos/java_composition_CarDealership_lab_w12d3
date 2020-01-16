package cars;

import carComponents.DieselEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private DieselEngine dieselEngine;

    @Before
    public void before() {
        car = new Car(30000, ColourType.BLUE, dieselEngine);
    }

    @Test
    public void canGetPrice(){
        assertEquals(30000, car.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice(){
        car.setPrice(40000);
        assertEquals(40000, car.getPrice(), 0.01);
    }

    @Test
    public void canReevaluatePrice(){
        car.setDamage(true);
        assertEquals(21000, car.getPrice(), 0.01);
    }

    @Test
    public void canGetDamage(){
        assertEquals(false, car.isDamage());
    }

    @Test
    public void canSetDamage(){
        car.setDamage(true);
        assertEquals(true, car.isDamage());
    }

    @Test
    public void canGetColourDescription(){
        assertEquals("blue", car.getColour());
    }

    @Test
    public void canGetEnginePower(){
        assertEquals(9, car.getEngine().getPower());
    }

    @Test
    public void canGetFourTyres(){
        assertEquals(4, car.getTyres().length);
    }

    @Test
    public void engineStartsOff(){
        assertEquals(false, car.engineStarted);
    }

    @Test
    public void canStartEngine(){
        car.startEngine();
        assertEquals(true, car.engineStarted);
    }

    @Test
    public void canStopEngine(){
        car.startEngine();
        car.stopEngine();
        assertEquals(false, car.engineStarted);
    }

    @Test
    public void canGetDistanceTravelled(){
        assertEquals(0, car.getDistanceTravelled());
    }

    @Test
    public void canGetPollution(){
        assertEquals(0, car.getPollution());
    }

//    @Test
//    public void canGetCoolness(){
//        assertEquals(0, car.getCoolness());
//    }







}
