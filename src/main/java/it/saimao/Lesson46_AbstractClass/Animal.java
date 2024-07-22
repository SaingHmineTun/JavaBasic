package it.saimao.Lesson46_AbstractClass;

public abstract class Animal {
    abstract void makeSound(); // Abstract method

    public void print() { // Normal method
        System.out.println("I'm Animal");
    }
}
