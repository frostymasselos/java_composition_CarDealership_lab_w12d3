package cars;

import carComponents.DieselEngine;
import carComponents.Engine;

public class Car extends CarVehicle {

    public Car(String name, Double price, ColourType colour, Engine engine){
        super(name, price, colour, new DieselEngine());
    }

}
