
//1234 Hello6789Hello1112 …
import java.util.Scanner;

public class Loop28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i);
            if (i % 5 == 0) {
                System.out.print("Hello");
            }
            i++;
        }
    }
}
