package PatternQues;
public class Pattern65 {
    public static void main(String[] args) {
        // char ch = 'A';

        for (char i = 'A'; i <= 'E'; i += 1) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(" ");
            }
            for (char k = 'A'; k <= i; k++) {
                if (i == k || i == 'E' || k == 'A') {
                    System.out.print(" " + i);
                } else {
                    System.out.print("  ");
                }
                // ch++;
            }
            // ch = 'A';
            System.out.println();
        }
    }
}
