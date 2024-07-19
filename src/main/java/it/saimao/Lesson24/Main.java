package it.saimao.Lesson24;
public class Main {
    public static void main(String[] args) {
        // for ( တေႇ ; ၸႅတ်ႈ ; တိူဝ်း/ယွမ်း )
//        int a = 5;
//        while (a > 0) {
//            System.out.println(a);
//            a --;
//        }
        // break;
        for (int a = 100; a > 0; a-=5) {
            if (a == 20) break;
            System.out.println(a);
        }
    }
}