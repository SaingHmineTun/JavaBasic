package it.saimao.Lesson47_Interface;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
