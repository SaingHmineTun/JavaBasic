package it.saimao.Lesson77;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String message = """
                Please choose your action
                1. Read file
                2. Write file
                3. Exit
                """;


        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println(message);
            File file = new File("MyFile.txt");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> readFile(file);
                case 2 -> writeFile(file);
                case 3 -> exit = true;
                default -> System.out.println("Please enter valid number!");
            }
        }

    }

    private static void writeFile(File file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            System.out.println("Please write down your note here!");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            writer.append(line);
            writer.close();
        } catch (IOException e) {
            System.out.println("Cannot write file");
        }
    }

    private static void readFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
    }
}
