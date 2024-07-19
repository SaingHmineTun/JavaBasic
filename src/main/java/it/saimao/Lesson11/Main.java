package it.saimao.Lesson11;

public class Main {
    public static void main(String[] args) {
        /*
        Ternary Operators
        1) Unary Operators ( +5 , -5 , ++5 , 5-- , !true )
        2) Binary Operators ( 5 + 5, true && false, 5 > 6 )
        3) Ternary Operator
         */

        int x = 11; // x ယႂ်ႇ = x - y
        int y = 10; // y ယႂ်ႇ = y - x
        int z;
        z = x > y ? x - y : y - x;
        System.out.println(z);
    }
}
