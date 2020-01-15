package cars;

import carComponents.Engine;
import carComponents.Tyre;


public abstract class CarVehicle {

    private int price;
    private ColourType colour;
    private Engine engine;
    private Tyre[] tyres;
    boolean damage;

    public CarVehicle(int price, ColourType colour, Engine engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = new Tyre[4];
    }



}
