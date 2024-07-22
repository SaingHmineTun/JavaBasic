package it.saimao.Lesson68_ThreadSynchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.init();
    }

    int counter = 0;

    // Using synchronized method
    private synchronized void increaseCounter() {
        counter++;
        System.out.println("Counter - " + counter);
    }

    // Using synchronized block
    private void incCounter() {
        synchronized (this) {
            counter++;
        }
        System.out.println("Counter - " + counter);
    }

    private void init() throws InterruptedException {

        class WorkerThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 100_000; i++) {
                    increaseCounter();
                }
            }
        }

        Thread th1 = new WorkerThread();
        th1.start();
        Thread th2 = new WorkerThread();
        th2.start();
        Thread th3 = new WorkerThread();
        th3.start();
        Thread th4 = new WorkerThread();
        th4.start();

        th1.join();
        th2.join();
        th3.join();
        th4.join();

        System.out.println("Counter - " + counter);


    }


}
