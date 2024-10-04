package PatternQues;
/* 1 2 3 4 5 6 7 8 9
    1 2 3 4 5 6 7
      1 2 3 4 5
        1 2 3
          1 */

public class Pattern69 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i = i - 2) {
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
