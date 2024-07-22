package it.saimao.Lesson12_String;

public class SaiMao {
    public static void main(String[] args) {
        // 1. ႁဵတ်ႉၼႄ String variable ဢၼ်ၼိုင်ႈ
        String name = "Sai Mao";
//        System.out.println(name);

        // 2. ၼႄလွင်ႈ လၢၵ်ႇလၢႆး Reference Data type ၵမ်ႈၽွင်ႈ
        // Data type - (1) Primitive  (2) Reference (0.00001%)
        String org = new String("ထုင်ႉမၢဝ်းၶမ်း");
        boolean isEmpty = org.isEmpty();
//        System.out.println(isEmpty);

        // Primitive : ၵွၵ်းၼမ်ႉ မီႈၼမ်ႉဝႆႉ
        // Reference : ၵွၵ်းၼမ်ႉ မီးၽိုၼ်လိၵ်ႈမွၵ်ႇလၢတ်ႈ ဢွင်ႈတီႈၵႂႃႇဢဝ်ၼမ်ႉ

        // 3. ၸႅတ်ႈၵႃႊၶၼ် String 2 ဢၼ်ဝႃႈ ၸွင်ႇၶဝ်မိူၼ်ၵၼ်
        String a = new String("A");
        String a2 = new String("A");
        boolean isSimilar = a.equals(a2);
//        System.out.println(isSimilar);

        // 3.1 ၸႅတ်ႈတီႈယူႇ String သွင်ဢၼ်
        String a3 = a2;
        boolean isSamePlace = a2 == a3;
//        System.out.println(isSamePlace);

        // 4. လၢႆႊ String ႁႂ်ႈပဵၼ် တူဝ်လဵၵ်ႉ ၊ တူဝ်ႇယႂ်ႇ တၢင်းမူတ်း
        String myName = "Sai Mao from Muse";
        String capital = myName.toUpperCase();
        System.out.println(capital);
        String small = myName.toLowerCase();
        System.out.println(small);
        boolean isEqualIgnoreCase = capital.equalsIgnoreCase(small);
        System.out.println(isEqualIgnoreCase);

        // 5. String Concatenation (လေႃး String)
        // 5 + 5 = 10
        System.out.println("Sai".concat("Mao"));
        System.out.println("Sai " + "Mao " + "From " + "Muse");

    }
}
