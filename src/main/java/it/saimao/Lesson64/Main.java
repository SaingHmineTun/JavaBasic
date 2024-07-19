package it.saimao.Lesson64;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("Looping ... " + i);
        }
        System.out.println("Main thread ended");
    }
}
