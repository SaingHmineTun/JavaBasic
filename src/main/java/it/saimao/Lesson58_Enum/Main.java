package it.saimao.Lesson58_Enum;

public class Main {
    public static void main(String[] args) {
        Priority priority = Priority.HIGH;
        printValue(priority);
    }

    public static void printValue(Priority priority) {
        System.out.println(priority.getName());
    }
}
