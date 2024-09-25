
/*1+11+111+1111+11111+… */
import java.util.Scanner;

public class Loop30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value more than 1000 for clear view of series");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            i = i * 10 + 1;
            System.out.print(i + "+");
        }
    }
}
