
//WAP to reverse a number
import java.util.Scanner;

public class Loop36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        int r;
        while (i <= n) {
            r = n % 10;
            sum = sum * 10 + r;

            n = n / 10;

        }
        System.out.print(sum);
    }
}
