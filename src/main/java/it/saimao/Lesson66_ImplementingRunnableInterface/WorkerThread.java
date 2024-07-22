package it.saimao.Lesson66_ImplementingRunnableInterface;

public class WorkerThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Worker Thread started");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Downloading ... " + i + "%");
        }
        System.out.println("Worker Thread ended");
    }
}
