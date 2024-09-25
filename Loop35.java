
//WAP to count number of digits
import java.util.Scanner;

public class Loop35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int r;
        int count = 0;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
