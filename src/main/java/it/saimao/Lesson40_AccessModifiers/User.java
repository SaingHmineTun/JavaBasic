package it.saimao.Lesson40_AccessModifiers;

public class User {
    private String name; // Cannot access from outer classes
    public  int age; // Accessible from anywhere
    char gender; // Accessible if in the same package, otherwise NO.
}
