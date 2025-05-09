import java.util.*;

public class FRecur {

    static int fact(int num){
        if (num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println("Factorial : "+f);
        while (true){
            if (f%10!=0){
                break;
            }
            f=f/10;
            count++;
            
        }
        System.out.println("Trailing Zeros : "+count);
        sc.close();
    }
}
