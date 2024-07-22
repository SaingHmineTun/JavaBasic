package it.saimao.Lesson44_UpcastingVsDowncasting;

public class Main {
    public static void main(String[] args) {
        Parent child = new Child2(); // Upcasting
        if (child instanceof Child1) {
            Child1 ch = (Child1) child; // Down-casting
            ch.printAge(18); // Can now call
        }
    }
}
