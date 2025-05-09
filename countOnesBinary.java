import java.util.Scanner;

public class countOnesBinary {
    public static void main(String[] args) {
        int num1,count=0;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        int temp=num1;
        String n=Integer.toBinaryString(num1);
        for(int i=0;i<n.length();i++){
            int last=num1&1;
            if(last==1){
                count++;
            }
            num1=num1>>1;
        }
        System.out.println("Count of 1 : "+count);
        System.out.println("Binary : "+n);
        System.out.println("Decimal : "+temp);
        sc.close();
    }
}
