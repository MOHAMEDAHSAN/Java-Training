//no of diff bits
import java.util.Scanner;

public class hammingDist {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        String n1=Integer.toBinaryString(num1);
        String n2=Integer.toBinaryString(num2);
        for(int i=0;i<(Math.max(n1.length(),n2.length()));i++){
            int last1=num1&1;
            int last2=num2&1;
            if(last1!=last2){
                count++;
            }
            num1=num1>>1;
            num2=num2>>1;
        }
        System.out.println("Hamming Distance: "+count);
        System.out.println("Num1 : "+n1);
        System.out.println("Num2 : "+n2);
        sc.close();
    }
}
