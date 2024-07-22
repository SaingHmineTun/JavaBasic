package it.saimao.Lesson9_RelationalOperators;

public class Main {
    public static void main(String[] args) {
        // 4. Relational (Comparison) Operators
        // == , != , < , > , <= , >=
        int x = 5;
        int y = 6;
        // == (Equal)
        boolean equal = x == y;
        System.out.println("Equal : " + equal);

        // != (Not Equal)
        boolean notEqual = x != y; // Not Equal , NOT operator (!true)
        System.out.println("Not Equal : " + notEqual);

        // < (Less Than)
        boolean lessThan = x < y;
        System.out.println("Less Than : " + lessThan);

        // > (Greater Than)
        boolean greaterThan = x > y;
        System.out.println("Greater Than : " + greaterThan);

        // <= (Less than and equal)
        boolean lessThanAndEqual = x <= y;
        System.out.println("Less Than Equal " + lessThanAndEqual);

        // >= (Greater than and equal)
        boolean greaterThanAndEqual = x >= y;
        System.out.println("Greater than equal : " + greaterThanAndEqual);

    }
}
