package cars;

import carComponents.DieselEngine;
import carComponents.Engine;

public class Car extends CarVehicle {

    public Car(double price, ColourType colour, Engine engine){
        super(price, colour, new DieselEngine());
    }

}
