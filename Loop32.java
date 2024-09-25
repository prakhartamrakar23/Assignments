
/*AbCdEfGh…… n terms */
import java.util.Scanner;

public class Loop32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value");
        int n = sc.nextInt();
        int i = 1;
        char ch = 'A';
        char ch1 = 'a';
        // ascii of A=65 ,Z=90and a=97 and z=122
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(ch1 + " ");
            } else {
                System.out.print(ch + " ");
            }
            // System.out.print(ch1);
            i++;
            ch++;
            ch1++;

        }

    }
}
