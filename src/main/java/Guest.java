package main.java;

class Guest extends User {
    Guest() {
        super("ゲスト");
    }
    boolean testAndMark(Article article) {
        return article.isFree();
    }
}
