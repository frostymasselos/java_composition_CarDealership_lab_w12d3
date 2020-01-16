package external;

public abstract class CostOfDamage {

    private Double multiplier;

    public CostOfDamage(){
        this.multiplier = 0.7;
    }

    public Double getMultiplier() {
        return multiplier;
    }
}
