package it.saimao.Lesson34_MethodReturnType;
public class Main {
    public static void main(String[] args) {
        // Object, Instance => Variable of Class
        String name = "Sai Lao";
        FacebookUser facebookUser1 = new FacebookUser();
        facebookUser1.name = name;
        int age = facebookUser1.age;

        FacebookUser facebookUser2 = new FacebookUser();
        facebookUser2.name = "Nong Hom";
        facebookUser2.age = 22;

        // Method
//        facebookUser1.printInfo();
//        facebookUser2.printInfo();

        // Method Return Type
        System.out.println(facebookUser2.password.toLowerCase());
        System.out.println(facebookUser2.getPassword().toLowerCase());

        String password = facebookUser2.password;
        System.out.println(password);
        password = facebookUser2.getPassword();
        System.out.println(password);
        password = facebookUser2.password;
        System.out.println(password);

    }
}


