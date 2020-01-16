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
    public void canGetColour(){
        assertEquals("blue", car.getColour());
    }

    @Test



}
