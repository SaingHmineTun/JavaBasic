package it.saimao.Lesson31_32_33_ClassObjectMethod;
// package -> folder, directory


public class Main {
    public static void main(String[] args) {
        // Create NRC object
        Nrc nrc = new Nrc(); // Create an object using NRC class and name it nrc
        nrc.name = "Sai Mao"; // Assign new value to name state in nrc object
        nrc.location = "Mu-se";
        String location = nrc.location; // Read state's value of nrc object
        nrc.number = "12345";

        // Methods
//        nrc.printName();

        nrc.printInfo();
    }
}