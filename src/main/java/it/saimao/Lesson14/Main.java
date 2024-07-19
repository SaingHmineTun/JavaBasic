package it.saimao.Lesson14;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. ႁဵတ်ႉ Array ဢၼ်ၼိုင်ႈ
        /*
        Array ငၢႆးၵၼ်တင်း String
         */

        int[] numbers0 = new int[5]; // ၵႃႊၶၼ်ပဵၼ် 0 မူတ်းမူတ်း
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = {2, 4, 6, 8, 10};

        // 2. ဢွၵ်ႇၼႄၵႃႊၶၼ် တီႈၼႂ်း Array
        int num = numbers2[3] + numbers1[4];
        System.out.println(num);

        // 3. ပိၼ်ႇလၢႆႊ ၵႃႊၶၼ် တီႈၼႂ်း Array
        System.out.println("Before : " + numbers1[0]);
        numbers1[0] = 10;
        System.out.println("After : " + numbers1[0]);

        // 4. Array ၼႆႉ ပေႃးႁဝ်း ႁဵတ်ႉယဝ်ႉၼႆ တေသႂ်ႇမႂ်ႇ ၊ တေထွၼ်ဢွၵ်ႇဢၼ်ၵဝ်ႇ ဢမ်ႇလႆႈ။
//        numbers0[5] = 12;

    }
}