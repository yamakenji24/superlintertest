package main.java;

public abstract class User {
    private final String name;

    User(String name) {
        this.name = name;
    }
    public String getName() { return name; }
    abstract boolean testAndMark(Article article);
}
