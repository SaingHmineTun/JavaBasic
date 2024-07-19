package it.saimao.Lesson60;

public class JavaExceptions {
    public static void main(String[] args) {
        JavaExceptions javaExceptions = new JavaExceptions();
        javaExceptions.init();
    }

    private Person person;

    private void init() {
        // Thread.sleep(1000); // Compile time exception or Checked exception
        person.name = "Sai Sai"; // Runtime exception or Unchecked exception
    }
}