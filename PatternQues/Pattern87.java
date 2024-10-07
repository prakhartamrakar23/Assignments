package PatternQues;
/*        1
        1 0 1
      1 0 1 0 1
    1 0 1 0 1 0 1
  1 0 1 0 1 0 1 0 1 */

public class Pattern87 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i = i + 2) {
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j % 2);
            }
            System.out.println();
        }
    }
}
