package Assignments.ArraysQuestions;
import java.util.Scanner;

public class Q5Kth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of k ");
        int kth = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            if (i == kth - 1) {
                System.out.println("kth largest element is " + arr[i]);

            }

        }
        System.out.println("-------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
