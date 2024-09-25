import java.util.Scanner;

public class Loop39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fact = 1;
        int r;
        int sum = 0;
        int temp = n;
        while (n != 0) {
            r = n % 10;
            while (r != 1) {
                fact = fact * r;
                sum = sum + fact;
                r--;
            }

            n = n / 10;
        }

        System.out.println(sum);
        if (sum == temp) {
            System.out.println("strong number");
        } else {
            System.out.println("not strong");
        }

    }
}
