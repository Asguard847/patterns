package Strategy.model;

import Strategy.model.Character;
import Strategy.model.Movement;

public class Pegasus extends Character {

    public void move(Movement movement){
        movement.move();
    }
}
