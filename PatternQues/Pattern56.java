package PatternQues;
/*    1
     1 2
    1 2 3
   1 2 3 4
  1 2 3 4 5 */

public class Pattern56 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();

        }

    }
}
