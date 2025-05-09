import java.util.Scanner;

public class fibonacci {
    public static void fib(int a,int b,int n){
        if (n==1){
            return;
        }
        int temp=b;
        b=a+b;
        a=temp;
        System.out.print(b+" ");
        fib(a,b,n-1);
    }

    public static int fibo(int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    fib(0,1,n);
    int res=fibo(n);
    System.out.println();
    System.out.println("Fibo: "+res);
    sc.close();
    }
}
