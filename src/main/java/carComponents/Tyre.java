package carComponents;

import cars.ColourType;

public class Tyre {

    private ColourType colour;

    public Tyre(){
        this.colour = ColourType.BLACK;
    }

    public String getColourTypeDescription(){
        return this.colour.getDescription();
    }
}
