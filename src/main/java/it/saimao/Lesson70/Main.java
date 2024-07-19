package it.saimao.Lesson70;

public class Main {
    public static void main(String[] args) {
        User1 user1 = new User1();
        user1.password = 1234;

        User2 user2 = new User2();
        user2.password = "Sai Sai";

        User<String, Boolean> user = new User();
        user.setPassword("Sai Sai");
        user.phoneNumber = true;

        String i = user.getValue("123");

    }
}
