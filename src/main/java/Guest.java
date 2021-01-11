package main.java;

class Guest extends User {
    Guest() {
        super("Guest");
    }
    boolean testAndMark(Article article) {
        return article.isFree();
    }
}
