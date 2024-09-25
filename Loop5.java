
import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");

        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;

            i++;
        }
        System.out.println("factorial of " + num + " is " + fact);
        sc.close();
    }
}
