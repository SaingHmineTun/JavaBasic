package it.saimao.Lesson8;

public class Main {
    public static void main(String[] args) {
        // 3. Unary Operators ( + , - , ++ , -- , ! )
        // Arithmetic - Operand + Operand = 3 + 5
        // Unary - -10, +10,
        int number = -10 + 5;
        System.out.println(number);

        // Increment Operators
        // Pre-increment , Post-increment
        int x = 5;
        System.out.println(--x); // Pre-increment / Pre-decrement

        int y = 5;
        System.out.println(y--); // Post-increment / Post-decrement
        System.out.println(y);

        // ! = (NOT OPERATOR)
        boolean bool = false;
        System.out.println(!bool);

    }
}
