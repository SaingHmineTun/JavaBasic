package it.saimao.Lesson67_JoinThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        Thread th = new Thread(() -> {
            System.out.println("Custom thread started");
            for (double d = 0.1; d < 1; d += .1) {
                System.out.println("Downloading ... " + d);
            }
            System.out.println("Custom thread ended");
        });
        th.start();

        th.join();

        System.out.println("Main thread ended");
    }
}
