package it.saimao.Lesson36_MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.printAge();
        main.printAge(28);
        byte age = 18;
        main.printAge(age);
    }

    private void printAge() {
        System.out.println("ဢသၢၵ်ႈၶႃႈ 28 ပီႊ");
    }

    private void printAge(int age) {
        System.out.println("ဢသၢၵ်ႈၶႃႈၸၢႆး " + age + " ပီႊ");
    }

    private void printAge(byte age) {
        System.out.println("ဢသၢၵ်ႈၶႃႈၸၢႆး " + age + " ပီႊ");
    }

}
