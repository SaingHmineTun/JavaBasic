package it.saimao.Lesson27;
public class Main {
    public static void main(String[] args) {
        int[][] table = {
                {1, 2, 3, 4, 5},
                {10, 30, 50},
                {20, 40, 60, 80}
        };
        for (int i = 0; i < table.length; i++) {
            int[] row = table[i];
            for (int column: row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}