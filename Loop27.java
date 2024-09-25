
import java.util.Scanner;

public class Loop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the end value");
        int n = sc.nextInt();
        char ch = '#';
        char ch1 = '*';
        int i = 1;
        while (i <= n) {
            // if (n % 2 == 0) {
            // System.out.println(ch);

            // } else {
            // System.out.println(ch1);
            System.out.print(ch + "" + ch1);
            i++;
        }

    }
}
