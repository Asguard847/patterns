package AbstractFactory.factory;

import AbstractFactory.model.EngSoundtrack;
import AbstractFactory.model.EngSub;
import AbstractFactory.model.Soundtrack;
import AbstractFactory.model.Subtitles;

public class EnglishFactory extends AbstractFactory {

    public Soundtrack getSoundtrack() {
        return new EngSoundtrack();
    }

    public Subtitles getSubtitles() {
        return new EngSub();
    }
}
