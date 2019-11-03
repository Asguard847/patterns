package AbstractFactory.factory;

import AbstractFactory.model.LanguageTypes;

public class FactoryProducer {

    public static AbstractFactory getFactory(LanguageTypes type){
        switch (type){
            case ENGLISH:
                return new EnglishFactory();
            case RUSSIAN:
                return new RussianFactory();
            case UKRAINIAN:
                return new UkrainianFactory();
            default:
                return null;
        }
    }
}
