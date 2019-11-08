package Strategy.model;

import java.util.List;

public class Party {

    private List<Character> characters;

    public void move(Movement movement){
        movement.move();
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
