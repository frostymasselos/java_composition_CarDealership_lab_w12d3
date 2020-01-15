package carComponents;

public abstract class Engine {
    private int power;
    private int pollutionRating;

    public Engine(int power, int pollutionRating) {
        this.power = power;
        this.pollutionRating = pollutionRating;
    }

    public int getPower(){
        return power;
    }

    public int getPollutionRating(){
        return pollutionRating;
    }
}
