//WAP to check whether entered number is perfect or not

import java.util.Scanner;

public class Loop34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i < n) {
            if (n % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }

            i++;

        }
        if (sum == n) {
            System.out.println("number is perfect");
        } else
            System.out.println("number is not perfect");

    }
}
