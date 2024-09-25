
//fibonacci
import java.util.Scanner;

public class Loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int n = sc.nextInt();
        int i = 1;
        int a = 0;
        int b = 1;
        int c;
        while (i <= n) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(a);
            i++;
        }
        sc.close();
    }
}
