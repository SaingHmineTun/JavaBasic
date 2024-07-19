package it.saimao.Lesson36;
public class Main {
    public static void main(String[] args) {

        User saiMao = new User();
        saiMao.printHello();
        // Method Argument
        String name = saiMao.getName();
        System.out.println(name);
        System.out.println(saiMao.getAge());

        String taiKaw = saiMao.print("တႆးၵေႃႉ");
        System.out.println("### : " + taiKaw);

        saiMao.printInfo("Sai Mao", 28);

    }





}