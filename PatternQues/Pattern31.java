package PatternQues;
/*
ABCDE
ABCD
ABC
AB
A */

public class Pattern31 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            ch = 65;
            System.out.println();
        }

    }
}
