package cars;

import carComponents.Engine;
import carComponents.Tyre;

public abstract class CarVehicle {

    private double price;
    private ColourType colour;
    private Engine engine;
    private Tyre[] tyres;
    private boolean damage;
    protected boolean engineStarted;
    protected int distanceTravelled;
    private int pollution;
    private int coolness;

    public CarVehicle(double price, ColourType colour, Engine engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = new Tyre[4];
        this.damage = false;
        this.engineStarted = false;
        this.distanceTravelled = 0;
        this.pollution = 0;
        this.coolness = 0;

    }

    public double getPrice(){
        if (this.damage == true){
            this.price = (this.price * 0.7);
        }
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getColour() {
        return colour.getDescription();
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre[] getTyres() {
        return tyres;
    }

    public boolean isDamage() {
        return damage;
    }

    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    public int getDistanceTravelled(){
        return this.distanceTravelled;
    }

    public int getPollution(){
        return this.pollution;
    }

    public int getCoolness(){
        return this.coolness;
    }

    public void startEngine(){
        this.engineStarted = true;
        System.out.println("Engine Started");
    }

    public void stopEngine(){
        this.engineStarted = false;
        System.out.println("Engine off");
    }

    public void go(int distance){
        if (this.engineStarted == true){
            this.distanceTravelled += distance;
            this.pollution += 0.005 * (distance * this.engine.getPollutionRating());
            this.coolness += 0.005 * (distance * this.engine.getPower());
            System.out.println("Driving!");
            System.out.println("You have driven " + Integer.toString(distance) + " metres");
            System.out.println("Total distance: " + Integer.toString(this.distanceTravelled) + " metres");
            System.out.println("Total pollution: " + Integer.toString(this.pollution) + " smogs");
            System.out.println("Total coolness: " + Integer.toString(this.coolness) + " shades");
        } else {
            System.out.println("Engine isn't started");
        }

    }

}
