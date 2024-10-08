package Assignments.ArraysQuestions;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array elements ");

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < 0) {

                    temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
