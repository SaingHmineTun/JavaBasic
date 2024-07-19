package it.saimao.Lesson62;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.init();
        } catch (InterruptedException e) {
            System.out.println("Cannot sleep");
        }
    }

    private void init() throws InterruptedException {
        System.out.println("Before sleep");
        Thread.sleep(1000);
        System.out.println("After sleep");
    }
}
