package PatternQues;
/*
1
10
1 1
1  0
10101 */

public class Pattern26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print(j % 2);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
