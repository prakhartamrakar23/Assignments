package PatternQues;
/*
1
123
12345
1234567
123456789 */

public class Pattern27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i + i - 1; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }
}
