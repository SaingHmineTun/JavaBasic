package it.saimao.Lesson22;
public class Main {
    public static void main(String[] args) {
        // while (ၽွင်းမႅၼ်ႈၸႂ်) { ႁဵတ်ႉၵၢၼ်တီႈၼႆႈ }
        // indefinite loop
//        int x = 1;
//        while (x <= 1000) {
//            System.out.println(x + " - Sai Mao");
//            x = x + 1;
//        }

        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int x = 0;
        while (x < chars.length) {
            System.out.println(chars[x]);
            x ++;
        }

    }
}