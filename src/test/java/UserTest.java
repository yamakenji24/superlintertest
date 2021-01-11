package test.java;

import main.java.AccountFactory;
import main.java.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testGetName() {
        AccountFactory factory = new AccountFactory();
        User guest = factory.createGuest();
        assertEquals("Guest", guest.getName());
    }
}
