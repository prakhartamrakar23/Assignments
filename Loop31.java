
/*9 99 999 9999 99999....n */
import java.util.Scanner;

public class Loop31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value :");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {

            i = i * 10;
            System.out.println(i - 1);
        }
    }
}
