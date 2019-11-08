package Flyweight;

public class Bacterium implements BacteriaInterface {

    private BacteriaType type;
    private int duplications;

    public Bacterium(BacteriaType type) {
        this.type = type;
    }

    @Override
    public void setDuplications(int duplications) {
        this.duplications = duplications;
    }

    @Override
    public int getDuplications() {
        return duplications;
    }
}
