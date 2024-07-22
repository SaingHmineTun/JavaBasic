package it.saimao.Lesson55_MethodLocalInnerClass;

public class Main {
    public static void main(String[] args) {
        class Cat implements Animal {
            public void makeSound() {
                System.out.println("Meow Meow");
            }
        }
        Cat cat = new Cat();
        speak(cat);
        speak(new Cat());
    }
    public static void speak(Animal animal) {
        animal.makeSound();
    }
}
