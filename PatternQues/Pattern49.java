package PatternQues;
/*55555
  4444
   333
    22
     1 */

public class Pattern49 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
