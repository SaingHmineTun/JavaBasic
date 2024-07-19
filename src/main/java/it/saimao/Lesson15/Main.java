package it.saimao.Lesson15;
public class Main {
    public static void main(String[] args) {
        /*
        1) ဢဝ် String သေပိၼ်ႇႁဵတ်ႉ Array
            1. char array
            2. String array
         */
        String name = "Sai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai MaoSai Mai";
        char[] chars = name.toCharArray();
        char four = chars[4];
        System.out.println("char Array : " + four);

        String[] strings = name.split(" ");
        System.out.println("String Array : " + strings[1]);

        // 2. ၸွတ်ႇႁူႉၼႂ်း Array မီးဝႆႉလၢႆဢၼ်
        int length = chars.length;
        System.out.println("Chars length : " + length);
        System.out.println("Strings length : " + strings.length);

        // 3. ဢွၵ်ႇၼႄ ၵႃႊၶၼ်လိုၼ်းသုတ်ႉ ဢၼ်မီးဝႆႉတီႈၼႂ်း Array
        char lastChar = chars[length - 1];
        System.out.println("Last char is : " + lastChar);
        System.out.println("Last string in String[] is : " + strings[strings.length - 1]);

    }
}