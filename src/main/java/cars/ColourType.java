package cars;

public enum ColourType {

    RED("red"),
    BLACK("black"),
    BLUE("blue"),
    GREEN("green"),
    GREY("grey"),
    WHITE("white"),
    YELLOW("yellow");

    private final String description;

    private ColourType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
