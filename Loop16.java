
/*…... -6-3  0 3 6 9……. n terms  */
import java.util.Scanner;

public class Loop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the multiple of 3 to print series");
        int n = sc.nextInt();
        int i = 1;
        if (n % 3 == 0) {
            i = -n * i;
            while (i <= n) {

                System.out.print(i);
                i = i + 2;
                i++;
            }
        } else {
            System.out.println("invalid input");
        }

    }
}
