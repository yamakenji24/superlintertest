package com.company;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Article {
    private static final Map<String, Article> ARTICLES = new TreeMap<String, Article>();
    private final String id, headline, body;
    private final boolean free;

    private Article(String id, String headline, String body, boolean free) {
        this.id = id;
        this.headline = headline;
        this.body = body;
        this.free = free;
    }
    static Article create(String id, String headline, String body, boolean free) {
        Article article = new Article(id, headline, body, free);
        ARTICLES.put(id, article);
        return article;
    }
    static Article getArticle(String id) {
        return ARTICLES.get(id);
    }
    static Set<String> getIds() {
        return ARTICLES.keySet();
    }
    String getId() { return id; }
    String getHeadline() { return headline; }
    String getBody() { return body; }
    boolean isFree() { return free; }
}
