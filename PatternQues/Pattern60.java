package PatternQues;
/*        1
        1 2 3
      1 2 3 4 5
    1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8 9
    */

public class Pattern60 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i = i + 2) {
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
