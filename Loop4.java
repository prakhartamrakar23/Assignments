//table of any number

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("enter the num which table u wana print");
        int num = sc.nextInt();
        int table = 0;
        while (i <= 10) {
            table = num * i;
            System.out.println("Table of " + num + " is " + table);
            i++;
        }
        sc.close();
    }
}
