package it.saimao.Lesson19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        // 102 / 2 =
        if (num % 2 == 0) {
            System.out.println("တူဝ်ငၢၼ်");
        } else {
            System.out.println("တူဝ်မႄႈ");
        }
    }
}