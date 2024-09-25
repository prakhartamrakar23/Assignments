
/*0 4 16 36 64 ...  */
import java.util.Scanner;

public class Loop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            System.out.print(i * i + " ");
            i = i + 1;
            i++;

        }
    }
}
