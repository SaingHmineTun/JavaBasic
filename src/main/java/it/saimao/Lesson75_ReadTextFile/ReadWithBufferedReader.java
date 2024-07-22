package it.saimao.Lesson75_ReadTextFile;

import java.io.*;

public class ReadWithBufferedReader {
    public static void main(String[] args) {

        String path = "C:\\Users\\Sai Mao\\Desktop\\Shan Java Baic\\Module 8 - File handling\\Lesson75 - Read text file\\Lesson75.txt";
        File file = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Selected file not found");
        } catch (IOException e) {
            System.out.println("Cannot read line");
        }

    }
}
