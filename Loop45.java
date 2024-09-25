import java.util.Scanner;

public class Loop45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int r;
        int sum = 0;
        int total = 0;

        while (n != 0) {
            r = n % 10;
            total = total + r;
            sum = sum * 10 + r;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println("sum of all digits is " + total);
    }
}
