
/*1 9 25 49 81.... */
import java.util.Scanner;

public class Loop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i * i + " ");
            i = i + 2;

        }
    }
}
