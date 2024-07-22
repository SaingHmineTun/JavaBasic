package it.saimao.Lesson15_CreateArrayFromString;
public class Main {
    public static void main(String[] args) {
        /*
        1) ဢဝ် String သေပိၼ်ႇႁဵတ်ႉ Array
            1. char array
            2. String array
         */
        // 1. String to char[]
        String name = "Sai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai Mai";
        char[] chars = name.toCharArray();
        char four = chars[4];
        System.out.println("char Array : " + four);

        // 2. String to String[]
        String nakama = "Luffy, Zoro, Sanji, Nami, Usopp";
        String[] nakamas = nakama.split(" ");
        System.out.println("String Array : " + nakamas[1]);

        // 2. ၸွတ်ႇႁူႉၼႂ်း Array မီးဝႆႉလၢႆဢၼ်
        int length = chars.length;
        System.out.println("Chars length : " + length);
        System.out.println("Strings length : " + nakamas.length);

        // 3. ဢွၵ်ႇၼႄ ၵႃႊၶၼ်လိုၼ်းသုတ်ႉ ဢၼ်မီးဝႆႉတီႈၼႂ်း Array
        char lastChar = chars[length - 1];
        System.out.println("Last char is : " + lastChar);
        System.out.println("Last string in String[] is : " + nakamas[nakamas.length - 1]);

    }
}