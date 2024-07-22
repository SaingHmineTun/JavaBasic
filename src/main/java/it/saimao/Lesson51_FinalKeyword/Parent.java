package it.saimao.Lesson51_FinalKeyword;

public class Parent {
    // In inheritance, cannot overwrite final method
    public final void print() {
        System.out.println("I'm parent");
    }
}
