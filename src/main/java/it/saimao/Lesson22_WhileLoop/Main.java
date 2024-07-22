package it.saimao.Lesson22_WhileLoop;
public class Main {
    public static void main(String[] args) {
        // while (ၽွင်းမႅၼ်ႈၸႂ်) { ႁဵတ်ႉၵၢၼ်တီႈၼႆႈ }
        // indefinite loop
        boolean go = true;
        while (go) {
            System.out.println("Indefinite loop");
        }
//        int x = 1; // Initial statement
//        while (x <= 1000) { // Conditional statement
//            System.out.println(x + " - Sai Mao");
//            x = x + 1; // Update statement
//        }

        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int x = 0;
        while (x < chars.length) {
            System.out.println(chars[x]);
            x ++;
        }

    }
}