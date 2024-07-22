package it.saimao.Lesson56_AnonymousInnerClass;

import it.saimao.Lesson55_MethodLocalInnerClass.Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = () -> System.out.println("Woof Woof");
        speak(dog);
    }
    public static void speak(Animal animal) {
        animal.makeSound();
    }
}
