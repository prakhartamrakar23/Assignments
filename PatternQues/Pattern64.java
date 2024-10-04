package PatternQues;
/*          1
        1 * 1
      1 * * * 1
    1 * * * * * 1
  1 1 1 1 1 1 1 1 1
   */

public class Pattern64 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i = i + 2) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == k || i == 9 || k == 1) {
                    System.out.print(" 1");
                } else
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
