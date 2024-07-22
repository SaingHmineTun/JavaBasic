package it.saimao.Lesson26_NestedIf;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("သႂ်ႇဢမၢတ်ႈသူလႄႈ");
            int result = sc.nextInt();
            if (result >= 0 && result <= 100) {
                // result < 40 - တူၵ်ႉလိၵ်ႈ
                if (result < 40) {
                    System.out.println("တူၵ်ႉလိၵ်ႈ");
                }
                // result >= 40 && result < 75 - ဢွင်ႇပူၼ်ႉ
                else if (result >= 40 && result < 75) {
                    System.out.println("ဢွင်ႇယူဝ်းယူဝ်း");
                }
                // result > 75 - လၢဝ်ၸွင်ႉ
                else if (result >= 75){
                    System.out.println("ဢွင်ႇလူၺ်ႈလၢဝ်ၸွင်ႈ");
                }
                break;
            } else {
                System.out.println("သူသႂ်ႇၽိတ်ႉ");
                System.out.println("######################");
            }
        }
    }
}