package it.saimao.Lesson10;

/**
 * ၵၢၼ်သွၼ်ၼႆႉ လၢတ်ႈလွင်ႈ Logical Operators
 */
public class Main {
    public static void main(String[] args) {
        /*
        && ( Logical AND operator)
        true && true => true
        false && true => false
        false && false => false
        true && false => false
         */
        // Operand 2 ဢၼ်
        boolean and = (5 < 8) && (10 <= 11);
//        System.out.println(and);


        /*
        || ( Logical OR )
        true || true => true
        false || true => true
        true || false => true
        false || false => false
         */
        boolean or = false || false;
//        System.out.println(or);

        /*
        ! ( Logical NOT )
        !true = false
         */
        boolean not = !(6 > 5);
        System.out.println(not);

    }
}
