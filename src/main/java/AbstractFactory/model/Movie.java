package AbstractFactory.model;

public class Movie {

    private String title;
    private Soundtrack soundtrack;
    private Subtitles subtitles;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Soundtrack getSoundtrack() {
        return soundtrack;
    }

    public void setSoundtrack(Soundtrack soundtrack) {
        this.soundtrack = soundtrack;
    }

    public Subtitles getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(Subtitles subtitles) {
        this.subtitles = subtitles;
    }
}
