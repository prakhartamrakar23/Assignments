import java.util.Scanner;;

public class Loop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any odd number");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Odd number series upto N is ");
        while (i <= n) {
            System.out.println(i);
            i = i + 2;
        }
    }
}
