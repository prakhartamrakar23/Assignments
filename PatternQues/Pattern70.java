package PatternQues;
/* A B C D E F G H I
    A B C D E F G
      A B C D E
        A B C
          A */

public class Pattern70 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 5; i >= 1; i--) {
            for (int k = 5; k >= i; k--) {
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
