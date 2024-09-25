
/*1,4,9,16,25….. */
import java.util.Scanner;

public class Loop21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fnal value");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i * i + " ");
            i++;
        }
    }
}
