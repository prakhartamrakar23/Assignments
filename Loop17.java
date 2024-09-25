
/*1 2 4 7 11 16 …… n terms */
import java.util.Scanner;

public class Loop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value");
        int n = sc.nextInt();
        int i = 1;
        int a = 0;
        while (i <= n) {

            System.out.println(i);
            i = a + i;
            a = i;
            i++;
        }

    }
}
