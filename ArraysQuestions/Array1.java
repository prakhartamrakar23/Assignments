package Assignments.ArraysQuestions;
import java.util.Scanner;

public class Array1 {

  public void peak(int arr[]) {
    if (arr.length == 1) {
      System.out.println(arr[0]);
    }
    if (arr[0] > arr[1]) {
      System.out.println(arr[0]);
    }
    if (arr[arr.length - 1] > arr[arr.length - 2]) {
      System.out.println(arr[arr.length - 1]);
    }
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i - 1]) {
        System.out.println(arr[i]);
      }
    }

  }

  // main method
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("enter the elements of array ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    Array1 obj = new Array1();
    obj.peak(arr);
    // System.out.println();

  }
}
