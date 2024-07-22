package it.saimao.Lesson65_ExtendingThreadClass;

public class WorkerThread extends Thread {

    @Override
    public void run() {
        System.out.println("Worker Thread started");
        for (int i = 0; i < 10; i ++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Looping ... " + i);
        }
        System.out.println("Worker Thread ended");
    }
}
