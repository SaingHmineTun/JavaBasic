package it.saimao.Lesson66;


public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started");
//        Thread thread = new Thread(new WorkerThread());
//        thread.start();

        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(i++);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();

        System.out.println("Main thread ended");
    }
}
