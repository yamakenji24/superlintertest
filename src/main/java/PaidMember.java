package main.java;

class PaidMember extends Member {
    PaidMember(String name) {
        super(name);
    }
    boolean testAndMark(Article article) {
        return true;
    }
}
