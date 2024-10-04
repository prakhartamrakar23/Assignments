package PatternQues;
/*    A
     A B
    A B C
   A B C D
  A B C D E */

public class Pattern57 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 1; i <= 5; i++) {
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
