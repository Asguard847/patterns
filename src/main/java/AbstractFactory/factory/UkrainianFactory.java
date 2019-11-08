package AbstractFactory.factory;

import AbstractFactory.model.Soundtrack;
import AbstractFactory.model.Subtitles;
import AbstractFactory.model.UkrSoundtrack;
import AbstractFactory.model.UkrSub;

public class UkrainianFactory extends AbstractFactory {

    public Soundtrack getSoundtrack() {
        return new UkrSoundtrack();
    }

    public Subtitles getSubtitles() {
        return new UkrSub();
    }
}
