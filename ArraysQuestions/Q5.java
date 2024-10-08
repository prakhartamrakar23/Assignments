package Assignments.ArraysQuestions;
import java.util.Scanner;

public class Q5 { // linear search use in this ques.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the integer number u wana search ");
        int num = sc.nextInt();

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(" number found at " + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("number not found ");
        }
    }

}
