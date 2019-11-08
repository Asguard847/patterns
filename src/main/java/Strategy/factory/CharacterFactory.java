package Strategy.factory;

import Strategy.model.Character;
import Strategy.model.CharacterType;

public interface CharacterFactory {

    Character createCharacter(CharacterType type);

}