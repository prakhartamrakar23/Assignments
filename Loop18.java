
import java.util.Scanner;

public class Loop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        int c;
        int i = 1;
        System.out.print(a + "  " + b);
        while (i <= n) {

            c = a * b;
            System.out.print(c + " ");
            a = b;
            b = c;

            i++;
        }
    }
}
