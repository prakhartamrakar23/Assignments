/* 1 2 3 4 5 6 7 8 9
    1 + + + + + 7
      1 + + +  5
        1  + 3
          1 */

public class Pattern73 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i = i - 2) {
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == k || i == 9 || k == 1) {
                    System.out.print(" " + k);
                } else {
                    System.out.print(" +");
                }

            }
            System.out.println();
        }
    }
}
