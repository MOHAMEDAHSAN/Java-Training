import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), sum = 0;
        for (int n = 1; n <= m; n++) {
            sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == n)
                System.out.println("Number : " + n + " IsPerfect : " + (sum == n));
        }
        sc.close();
    }
}
