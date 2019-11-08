package prototype;

public abstract class Article implements Cloneable {

    protected static int counter;
    protected int id;
    protected String title;
    protected String contents;

    public Article clone() {
        Article article = null;
        try {
            article = (Article) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return article;
    }

    public Article() {
        counter++;
        id = counter;
    }

    public Article (String title, String contents) {
        counter++;
        id = counter;
        this.title = title;
        this.contents = contents;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
