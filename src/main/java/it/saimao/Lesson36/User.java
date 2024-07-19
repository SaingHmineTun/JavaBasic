package it.saimao.Lesson36;

public class User {
    // Method Parameter
    public void printHello() {
        System.out.println("Hello");
    }

    public String print(String text) {
        System.out.println("Method Parameter #1 : " + text);
        return "ᥖᥭᥰ ᥐᥨᥝᥳ - " + text;
    }

    public void printInfo(String username, int age) {
        System.out.println("Your name is : " + username);
        System.out.println("You are " + age + " years old!!");
    }

    public String getName() {
        System.out.println("###");
        return "Sai Mao (Namhkam)";
    }

    public int getAge() {
        return 28;
    }
}
