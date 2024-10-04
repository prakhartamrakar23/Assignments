package PatternQues;
/*        A
        A B C
      A B C D E
    A B C D E F G
  A B C D E F G H I */

public class Pattern61 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 1; i <= 9; i = i + 2) {
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + ch);
                ch++;
            }
            ch = 65;
            System.out.println();
        }
    }
}
