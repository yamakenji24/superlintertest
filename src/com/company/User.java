package com.company;

abstract class User {
    private final String name;

    User(String name) {
        this.name = name;
    }
    String getName() { return name; }
    abstract boolean testAndMark(Article article);
}
