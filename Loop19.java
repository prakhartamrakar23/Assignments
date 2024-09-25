
/*1+1/2+1/3+1/4+1/5….. n terms(find out sum) */
import java.util.Scanner;

public class Loop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the final value");
        int n = sc.nextInt();
        double i = 1;
        double sum = 0;
        int a = 1;
        int b = 1;
        while (i <= n) {

            System.out.print(b + "/" + a + " + " + "\t");
            sum = sum + a / i;

            a++;
            i++;

        }
        System.out.println("sum" + sum);
    }
}
