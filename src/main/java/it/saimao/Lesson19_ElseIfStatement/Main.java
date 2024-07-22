package it.saimao.Lesson19_ElseIfStatement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive Value");
        } else if (num < 0) {
            System.out.println("Negative Value");
        } else {
            System.out.println("Zero");
        }
    }
}