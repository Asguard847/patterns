package Strategy;

import Strategy.factory.CharacterFactory;
import Strategy.factory.CharacterFactoryImpl;
import Strategy.model.*;
import Strategy.model.Character;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CharacterFactory factory = new CharacterFactoryImpl();

        System.out.println("And now our game begins!");

        List<Character> characters = new ArrayList<>();
        characters.add(factory.createCharacter(CharacterType.ELF));
        characters.add(factory.createCharacter(CharacterType.PEGASUS));

        Party party = new Party();
        party.setCharacters(characters);

        System.out.println("Let's walk!");
        party.move(new Walk());

        System.out.println("Let's fly!");
        party.move(new Flight());

    }
}
