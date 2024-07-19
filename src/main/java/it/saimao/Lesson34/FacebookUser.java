package it.saimao.Lesson34;

public class FacebookUser {
    String name = "Sai Mao";
    String password;
    int age = 27;

    void printInfo() {
        System.out.println(name);
        System.out.println(password);
        System.out.println(age);
    }

    String getName() {
        return name;
    }

    String getPassword() {
        if (password == null) password = "PASSWORD";
        return password;
    }

    int getAge() {
        return age;
    }


}
