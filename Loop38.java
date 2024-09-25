
//WAP to check whether entered number is Armstrong or not
import java.util.Scanner;

public class Loop38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        int r;
        int temp = n;

        while (n != 0) {
            r = n % 10;
            sum = sum + r * r * r;
            System.out.println(sum);
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("nuber is Armstrong");
        } else {
            System.out.println("nuber is not armstrong");
        }
    }
}
