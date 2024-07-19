package it.saimao.Lesson29;

public class Main {
    public static void main(String[] args) {
        // 1. ၵပ်းသိုပ်ႇပၼ် လွင်ႈဝႃႈ Unicode ၼႆႉ ႁဵတ်ႉၵၢၼ်ၸိူင်ႉႁိုဝ် တီႈ Java
        /*
        char => 2 bytes ( 0 -> 60000 ပၢႆ )
         */
        /*
        binary => 0, 1 (2)
        decimal => 0 - 9 (10)
        hexa-decimal => 0 - f (16)
         */
        char ka = 'ၵ';
        System.out.println((int) ka); // char to decimal
        System.out.println(Integer.toHexString(ka)); // char to hexa-decimal
        // 2. သွၵ်ႈႁႃ Code လိၵ်ႈတႆးမၢဝ်း ( Tai Le - Wikipedia Unicode Block )
        // https://en.wikipedia.org/wiki/Tai_Le_(Unicode_block)
        System.out.println('\u0e01');
        // 3. တႅမ်ႈတူဝ်မႄႈလိၵ်ႈတႆးတူဝ်မူၼ်း ႁႂ်ႈပိၼ်ႇပဵၼ်လိၵ်ႈတႆးမၢဝ်း (လိၵ်ႈတူဝ်ယၢဝ်း)
        System.out.println("##########################");
        String consonants = "ၵၶင";
        String taiLe = consonants.replace('ၵ', 'ᥐ');
        taiLe = taiLe.replace('ၶ', '\u1951');
        taiLe = taiLe.replace('င', '\u1952');
        System.out.println("လိၵ်ႈတႆး - " + consonants);
        System.out.println("လိၵ်ႈတူဝ်ယၢဝ်း - " + taiLe);
    }
}