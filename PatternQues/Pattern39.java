package PatternQues;
/*
 A
BCD
EFGHI
JKLMNOP*/

public class Pattern39 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i + i - 1; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
