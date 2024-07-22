package it.saimao.Lesson38_GlobalVsLocalVariable;

public class Test {
    String name = "Sai Mao"; // Global variable
    int age;

    public void printName(String name) {
        // Method local variable is invisible to other methods and constructors
        int age = 18;
        if (age > 18) {
            // Block local variable is inaccessible outside of this block
            // this.age shows default value for int data type that is 0
            String string = age + " vs " + this.age;
        }
    }

    public Test() {
        // Constructor local variable
        int number = 100;
        System.out.println("My name is " + name); // Access global variable - name
    }
}
