
import java.util.Scanner;

public class Loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int n = sc.nextInt();
        System.out.println("Even number series upto N is ");
        int i = 0;
        while (i <= n) {

            System.out.println(i);
            i = i + 2;
        }
    }
}
