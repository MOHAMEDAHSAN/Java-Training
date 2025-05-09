


public class cubeRoot {
   
   public static int cuberoot(int number) {
      int low = 0;
      int high = number;
      while (low <= high) {
         int mid = (low + high) / 2;
         int cube = mid * mid*mid;
         if (cube == number) {
            return mid;
         } else if (cube < number) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return 0;
   }
   public static void main(String[] args) {
      int n = 64;
      int result= cuberoot(n);
      System.out.println("Cube root of " + n + " = " + result);
   }
}