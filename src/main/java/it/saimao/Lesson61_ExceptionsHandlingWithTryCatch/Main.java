package it.saimao.Lesson61_ExceptionsHandlingWithTryCatch;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    String str = "ABC";

    private void init() {
        // open file
        try {
            // read or write
            int x = 10 / 2;
            str.isBlank();
            System.out.println("Before sleep");
            Thread.sleep(2500);
            System.out.println("After sleep");
        } catch (NullPointerException e) {
            System.out.println("str cannot be null");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            // exception
            System.out.println("Cannot sleep!");
        } finally {
            // close
            System.out.println("END OF TRY - CATCH");
        }
    }
}
