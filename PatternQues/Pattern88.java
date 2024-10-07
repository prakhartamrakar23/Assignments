package PatternQues;
/*
*       *
 *     * 
  *   *  
   * *   
    *    
   * *   
  *   *  
 *     * 
*       *
 */

public class Pattern88 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                if (i == k || i + k == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
