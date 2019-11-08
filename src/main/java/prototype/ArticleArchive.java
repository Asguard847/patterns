package prototype;

import java.util.HashMap;
import java.util.Map;

public class ArticleArchive {

    private Map<Integer, Article> articles;

    public void addArticle(Article article){
        articles.put(article.getId(), article);
    }

    public Article getArticle(int id){
        return articles.get(id);
    }

    public ArticleArchive() {
        articles = new HashMap<>();
    }

    public Map<Integer, Article> getArticles() {
        return articles;
    }

    public void setArticles(Map<Integer, Article> articles) {
        this.articles = articles;
    }
}
