
import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int i = 1;

        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i);

            }
            i++;
        }
    }
}
