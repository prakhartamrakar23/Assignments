
import java.util.Scanner;

public class Loop7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int i = 2;
        while (i <= num) {
            if (num % i == 0) {
                break;
            }
            i++;
        }
        if (num == i) {
            System.out.println(num + " prime");
        } else {
            System.out.println(num + " not prime");
        }
        sc.close();
    }
}
