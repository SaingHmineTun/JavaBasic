package it.saimao.Lesson31;
// package -> folder, directory


public class Main {
    public static void main(String[] args) {
        // Create NRC object
        Nrc nrc = new Nrc();
        nrc.name = "Sai Mao";
//        System.out.println("Name " + nrc.name);
        nrc.location = "Mu-se";
        String location = nrc.location;
        nrc.number = "12345";
//        System.out.println("Location: " + location);

        // Methods
//        nrc.printName();

        nrc.printInfo();
    }
}