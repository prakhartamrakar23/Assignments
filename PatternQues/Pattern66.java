package PatternQues;
public class Pattern66 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 5) {
                    System.out.print("#");
                }

            }
            for (int l = 1; l <= i - 1; l++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
