public class Pattern18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print(j);
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
