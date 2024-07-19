package it.saimao.Lesson28;
public class Main {
    public static void main(String[] args) {
        // 1. isEmpty & isBlank
        String a = "a";
        boolean isEmpty = a.isBlank();
        System.out.println(isEmpty);
        // 2. contains, startsWith, endsWith
        String b = "Sai";
        System.out.println(b.contains("ai"));
        System.out.println(b.startsWith("Sb"));
        System.out.println(b.endsWith("ai"));
        // 3. strip, stripLeading, stripTrailing
        String c = " Hello ";
        String str = c.stripTrailing();
        System.out.println(str);
        // 4. indexOf, lastIndexOf
        String d = "Shan State";
        int index = d.lastIndexOf("S");
        System.out.println(index);
        // 5. charAt
        char ch = d.charAt(3); // d[0]
        System.out.println(ch);


    }
}