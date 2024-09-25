
/*WAP to print N natural number */
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int i = n;
        while (i <= n) {
            System.out.println(i);
            i++;

        }
        sc.close();
    }
}
