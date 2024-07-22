package it.saimao.Lesson47_Interface;

public interface Animal {
    void makeSound(); // This is abstract method
    default void print() { // This is normal method
        System.out.println("I'm animal");
    }
}
