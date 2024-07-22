package it.saimao.Lesson46_AbstractClass;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        makeSound(dog);
        makeSound(new Cat());
    }

    private static void makeSound(Animal animal) {
        animal.makeSound();
    }

}
