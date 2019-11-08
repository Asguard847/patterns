package Strategy.model;

import Strategy.model.Movement;

public class Walk implements Movement {

    @Override
    public void move() {
        System.out.println("walking by foot");
    }
}
