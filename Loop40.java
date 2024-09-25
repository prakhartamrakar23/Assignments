import java.util.Scanner;

public class Loop40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int r;
        while (n != 0) {
            r = n % 10;
            if (r % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
            n = n / 10;
        }
        System.out.println("even =" + count1 + " odd = " + count2);
    }
}
