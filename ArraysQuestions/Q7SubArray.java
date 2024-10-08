package Assignments.ArraysQuestions;
import java.util.Scanner;

public class Q7SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        System.out.println("enter the sum ");
        int s = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == s) {
                    System.out.println("sub array of sum " + s + "index position is " + i + " to " + j);
                    break;
                }

            }

        }

    }
}
