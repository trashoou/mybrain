package homework.usertest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void validateEmailTest() {
        String email = "dima2002@zxzgmail.com";
        assertTrue(user.validateEmail(email));
    }

    @Test
    void validatePasswordTest() {
        String password =  "Qwerty12345!";
        assertTrue(user.validatePassword(password));
    }
}