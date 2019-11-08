package Strategy.model;

public class Flight implements Movement {

    @Override
    public void move() {
        System.out.println("Flying in the sky");
    }
}
