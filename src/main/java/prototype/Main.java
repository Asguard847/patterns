package prototype;

public class Main {

    private static ArticleArchive archive;

    public static void main(String[] args) {

        archive = new ArticleArchive();

        Article politics = new PoliticsArticle("political title", "political contents");
        Article economics = new EconomicsArticle("economics title", "economics contents");
        Article sports = new SportsArticle("sports title", "sports contents");

        archive.addArticle(politics);
        archive.addArticle(economics);
        archive.addArticle(sports);

        Article clonedPolitics = archive.getArticle(politics.getId()).clone();
        clonedPolitics.setTitle("Modified political title");
        clonedPolitics.setContents("Modified political contents");

        System.out.println(archive.getArticle(politics.getId()));
        System.out.println(clonedPolitics);

    }

}
