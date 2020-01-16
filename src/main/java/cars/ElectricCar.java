package cars;

import carComponents.ElectricEngine;
import carComponents.Engine;

public class ElectricCar extends CarVehicle {

    public ElectricCar(String name, Double price, ColourType colour, Engine engine){
        super(name, price, colour, new ElectricEngine());
    }
}
