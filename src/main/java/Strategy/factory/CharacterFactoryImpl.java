package Strategy.factory;

import Strategy.model.*;
import Strategy.model.Character;

public class CharacterFactoryImpl implements CharacterFactory{

    @Override
    public Character createCharacter(CharacterType type) {
       switch (type){
           case ELF:
               Character elf = new Elf();
               elf.setLevel(1);
               elf.setStrength(10);
               elf.setDexterity(15);
               elf.setHp(100);
               return elf;
           case HARPY:
               Character harpy = new Harpy();
               harpy.setLevel(1);
               harpy.setStrength(13);
               harpy.setDexterity(12);
               harpy.setHp(130);
               return harpy;
           case PEGASUS:
               Character pegasus = new Pegasus();
               pegasus.setLevel(1);
               pegasus.setStrength(12);
               pegasus.setDexterity(13);
               pegasus.setHp(120);
               return pegasus;
           default:
               return null;
       }
    }
}
