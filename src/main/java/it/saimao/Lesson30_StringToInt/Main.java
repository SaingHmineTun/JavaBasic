package it.saimao.Lesson30_StringToInt;
public class Main {
    public static void main(String[] args) {
        // ႁဝ်းမႃးဢဝ် String သေ ပိၼ်ႇပဵၼ် int ( String => int )
        String numString = "123";
        System.out.println(numString + 4); // String concat
        int numInt = Integer.parseInt(numString); // int (primitive) Integer (reference)
        System.out.println(numInt + 4);
    }
}