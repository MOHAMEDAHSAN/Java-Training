import java.util.Scanner;


public class sumOfNums {
    public static int sumNums(int n) {
        if (n==1){
            return 1;
        }
        return n+sumNums(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum :"+sumNums(n));
        sc.close();
    }
}
