
//WAP to check whether entered number is palindrome or not
import java.util.Scanner;

public class Loop37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp = n;
        // int i = 1;
        int sum = 0;
        int r;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;

            n = n / 10;

        }
        System.out.println(sum);
        if (temp == sum) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }
}
