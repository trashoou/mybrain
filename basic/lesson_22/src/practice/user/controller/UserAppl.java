package practice.user.controller;

import practice.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user1 = new User("usernamemail.com", "54321");

        System.out.println(user1);
    }
}
