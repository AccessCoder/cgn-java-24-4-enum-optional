package de.neuefische;

import java.util.List;
import java.util.Optional;

public class Repo {

    List<Article> articles = List.of(new Article("1", "Shoe"), new Article("2", "Sock"));

    public Optional<Article> getArticleById(String id){
        for (Article a:articles) {
            if (a.id().equals(id)) {
                return Optional.of(a);
            }
        }
        return Optional.empty();
    }
}
