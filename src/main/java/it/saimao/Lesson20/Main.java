package it.saimao.Lesson20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1) လၢႆးၼႆႉ ၸႂ်ႉတိုဝ်း keyword 3 ဢၼ်သေ ပဵၼ်လၢႆးၵဝ်ႇၵွၼ်ႇ ( switch, case, break )
        // else
        Scanner sc = new Scanner(System.in);
        System.out.println("တႅမ်ႈၵႃႊၶၼ် ၼႂ်းၵႄႈ 10 လႄႈ 20 တူၺ်းလႄႈ");
        int value = sc.nextInt();
//        switch (value) {
//            case 10, 11, 12, 13, 14, 15:
//                System.out.println("သူတိုၵ်ႉၵေႃႉလဵၵ်ႉယူႇ");
//                break;
//            case 20:
//                System.out.println("သူဢမ်ႇလဵၵ်ႉယဝ်ႉ");
//                break;
//            case 30:
//                System.out.println("သူၵေႃႉယႂ်ႇယဝ်ႉ။");
//                break;
//            default:
//                System.out.println("ဢမ်ႇႁူႉယဝ်ႉ");
//        }
        switch (value) {
            case 10, 11, 12, 13, 14, 15 -> System.out.println("သူတိုၵ်ႉၵေႃႉလဵၵ်ႉယူႇ");
            case 20 -> {
                System.out.println("သူဢမ်ႇလဵၵ်ႉယဝ်ႉ");
            }
            default -> {
                System.out.println("ဢမ်ႇႁူႉယဝ်ႉ");
            }
        }
    }
}