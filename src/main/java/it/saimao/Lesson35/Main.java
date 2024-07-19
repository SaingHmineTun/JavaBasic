package it.saimao.Lesson35;

import it.saimao.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.pin = 123;
//        user1.setName("TMK Group");
//        user1.setPin(1234);

        // Method Parameter
        user1.setData("S", 1234);
        // 123, !@#$%, abcd, ABCD
        System.out.println(user1.getName());
        System.out.println(user1.getPin());



    }
}