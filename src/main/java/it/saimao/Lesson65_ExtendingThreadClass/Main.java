package it.saimao.Lesson65_ExtendingThreadClass;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread started");
        Thread th = new WorkerThread();
        th.start();
        System.out.println("Main thread ended");

    }
}
