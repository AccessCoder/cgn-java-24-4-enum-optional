package de.neuefische;

public class Service {

    private final Repo repo;

    public Service() {
        this.repo =new Repo();
    }

    public String getArticleNameById(String id){
       Article a = repo.getArticleById(id).orElse(new Article("00000", "Not FOUND"));
       return a.name();
    }
}
