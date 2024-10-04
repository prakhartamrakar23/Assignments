package PatternQues;
/*  X
    X_X
   X_X_X
  X_X_X_X
 X_X_X_X_X
  */

public class Pattern58 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
                if (i > 1 && j < i) {
                    System.out.print("_");
                } else {
                    // System.out.print(" _");
                }
            }
            System.out.println();
        }
    }
}
