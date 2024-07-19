package it.saimao.Lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2. Scanner ၼႆႉပဵၼ်သင်?
        System.out.println("ၸိုဝ်ႈသူ ၸိုဝ်ႈသင်ၶႃႈ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("ၸိုဝ်ႈသူၸိုဝ်ႈႁွင်ႉ " + name);
        System.out.println("#####################");

        // 3. ၸႂ်ႉတိုဝ်း Scanner သေ ထၢမ်ဝႃႈ ပဵၼ်ၵူၼ်းၸၢႆးႁ??
        //ပေႃးၵူၼ်းၸၢႆးၼႆ တႅမ်ႈ Mr ပေႃးပဵၼ် ၼၢင်းယိင်းသမ်ႉ တႅမ်ႈ Mrs ပၼ်တီႈႁူဝ်ၼႃႈ ၸိုဝ်ႈ
        System.out.println("သူပဵၼ်ၵူၼ်းၸၢႆးႁ");
        boolean isMale = sc.nextBoolean();
        String prefixName = isMale ? "Mr" : "Mrs";
        var fullName = prefixName + " " + name;
        System.out.println(fullName);
        System.out.println("#######################");

        // 4. ၸႂ်ႉတိုဝ်း Scanner ထၢမ် ပီၵိူတ်ႇသေ တႅမ်ႈဢွၵ်ႇၼႄ ဢသၢၵ်ႈ?
        System.out.println("သူၵိူတ်ႇပီလႂ်ၶႃႈ?");
        int birthYear = sc.nextInt();
        int age = 2023 - birthYear;
        System.out.println("ဢသၢၵ်ႈသူမီး " + age + " ပီယဝ်ႉ။");
        System.out.println("#######################");

        // 5. Summary
        System.out.println("ၸိုဝ်ႈသူၸိုဝ်ႈႁွင်ႉ " + fullName + " လႄႈ");
        System.out.println("သူၵိူတ်ႇပီ " + birthYear + " ဢိူဝ်ႈ");
        System.out.println("ၵွပ်ႈၼႆ ဢသၢၵ်ႈသူမီး " + age + " ပီယဝ်ႉ။");
        System.out.println("#######################");

    }
}
