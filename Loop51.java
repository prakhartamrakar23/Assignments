import java.util.Scanner;

public class Loop51 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = scn.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = scn.nextInt();
        int i = n1, j, rev = 0, temp = 0;
        while (i <= n2) {
            System.out.println("Number is: " + i);
            for (rev = 0, temp = i, j = 0; temp > 0;) {
                j = temp % 10;
                rev = rev * 10 + j;
                temp = temp / 10;
            }
            System.out.println("Reverse: " + rev);
            i++;
        }
    }
}
