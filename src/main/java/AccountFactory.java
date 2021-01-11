package main.java;

public class AccountFactory {
    public User createGuest() {
        return new Guest();
    }
    public User createMember() {
        return new Member("Member");
    }
    public User createPaidMember() {
        return new PaidMember("Subscriber");
    }
}
