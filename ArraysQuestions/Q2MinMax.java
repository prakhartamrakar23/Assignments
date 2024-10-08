package Assignments.ArraysQuestions;
import java.util.Scanner;

public class Q2MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {

                max = arr[j];

            }
        }
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (min > arr[k]) {
                min = arr[k];
            }
        }
        System.out.println("min value is " + min);
        System.out.println("max value is " + max);

    }
}
