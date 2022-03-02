package InterPrograms;

public class Star_Pyramid_Program {
   public static void main(String[] args) {
      int i, j, k;
      for (i = 1; i <= 5; i++) {
         for (j = 4; j >= i; j--) {
            // System.out.println("1");
            System.out.print(" ");
         }
         for (k = 1; k <= (2 * i - 1); k++) {
            // System.out.println("2");
            System.out.print("*");
         }
         // System.out.println("3");
         System.out.println("");
      }
   }
}
