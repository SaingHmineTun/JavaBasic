package it.saimao.Lesson59_Singleton;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.setName("Sai Mao");
        person.setAge(18);
    }
}
