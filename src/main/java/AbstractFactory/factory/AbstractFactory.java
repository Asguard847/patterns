package AbstractFactory.factory;

import AbstractFactory.model.Soundtrack;
import AbstractFactory.model.Subtitles;

public abstract class AbstractFactory {

    public abstract Soundtrack getSoundtrack();

    public abstract Subtitles getSubtitles();

}
