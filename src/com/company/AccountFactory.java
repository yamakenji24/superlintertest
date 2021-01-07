package com.company;

public class AccountFactory {
    public User createGuest() {
        return new Guest();
    }
    public User createMember() {
        return new Member("会員A");
    }
    public User createPaidMember() {
        return new PaidMember("有料会員B");
    }
}
