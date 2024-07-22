package it.saimao.Lesson76_WriteTextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Sai Mao\\Desktop\\Sai Mao.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("Hello");
        writer.newLine();
        writer.append("Sai Mao");
        writer.close();

    }
}
