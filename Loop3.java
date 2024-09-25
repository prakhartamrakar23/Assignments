
/*WAP to find out the sum of N natural number. */
import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i < n) {
            sum = sum + i;
            i++;
            System.out.println(i);
        }
        System.out.println("sum is " + sum);
        sc.close();
    }

}
