package it.saimao.Lesson63_ThrowNewException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.init();
    }

    private void init() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        if (number < 1 || number > 6) {
            throw new NumberInvalidException("Number must be between 1 and 6");
        }
        System.out.println(number);
    }
}
