package AbstractFactory.factory;

import AbstractFactory.model.RusSoundtrack;
import AbstractFactory.model.RusSub;
import AbstractFactory.model.Soundtrack;
import AbstractFactory.model.Subtitles;

public class RussianFactory extends AbstractFactory {

    public Soundtrack getSoundtrack() {
        return new RusSoundtrack();
    }

    public Subtitles getSubtitles() {
        return new RusSub();
    }
}
