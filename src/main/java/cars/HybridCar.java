package cars;


import carComponents.Engine;
import carComponents.HybridEngine;

public class HybridCar extends CarVehicle {

    public HybridCar(String name, Double price, ColourType colour, Engine engine){
        super(name, price, colour, new HybridEngine());
    }

}
