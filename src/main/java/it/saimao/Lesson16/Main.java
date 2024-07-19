package it.saimao.Lesson16;
public class Main {
    public static void main(String[] args) {
        // 1. ႁဵတ်ႉတူဝ်း Multi-dimensional Array
        String[] person1 = {"Sai Mao", "Muse"};
        String[] person2 = {"Sai Lao", "Namhkam"};
        String[] person3 = "Sai Yee,Hsenwi".split(",");
        String[][] persons = {person1, person2, person3, {"Noung Hom", "Kutkai"}};

        // 2. ဢဝ်ၵႃႊၶၼ် တီႈၼႂ်းမၼ်း လႄႈ ပိၼ်ႇလၢႆႊၵႃႊၶၼ် တီႈၼႂ်းမၼ်း
        String name = persons[1][0];
        System.out.println("Name : " + name);
        System.out.println("City : " + persons[1][1]);

        System.out.println("Name : " + persons[2][0]);
        System.out.println("City : " + persons[2][1]);

        // 3. ထုၵ်ႈဢွၵ်ႇၼႄ ၵႃႊၶၼ်လိုၼ်းသုတ်ႉ ဢၼ်မီးဝႆႉတီႈၼႂ်း Multi-dimensional Array
        String[] lastArray = persons[persons.length - 1];
        String firstValue = lastArray[0];
        String lastValue = lastArray[lastArray.length - 1];
        System.out.println(firstValue + " lives in " + lastValue);
    }
}