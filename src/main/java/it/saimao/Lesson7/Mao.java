package it.saimao.Lesson7;

public class Mao {
    public static void main(String[] args) {
        // 2. Assignment Operators ( = , +=, -= , *=, /= , %= )
        int x = 5;
        System.out.println(x);

        // +=
        int a = 10;
//        a = a + 5;
        a += 5;
        System.out.println(a);

        int b = 10;
        // b = b - 8;
        b -= 8;
        System.out.println(b);

        int c = 2;
        c *= 2;
        System.out.println(c);

        int d = 9;
        d /= 3;
        System.out.println(d);

        int e = 5;
        e %= 3;
        System.out.println(e);
    }
}
