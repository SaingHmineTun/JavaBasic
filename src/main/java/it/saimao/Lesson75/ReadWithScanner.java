package it.saimao.Lesson75;

import java.io.*;
import java.util.Scanner;

public class ReadWithScanner {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\Sai Mao\\Desktop\\Shan Java Baic\\Module 8 - File handling\\Lesson75 - Read text file\\Lesson75.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
