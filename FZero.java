import java.util.Scanner;

public class FZero {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1;
        while(true){
            temp=temp*5;
            if (n<temp){
                temp=temp/5;
                break;
            }
        }
        int zero=0;
        System.out.println("Temp : "+temp);
        for(int i=temp;i!=1;i=i/5){
            zero=zero+n/i;
            
            System.out.println(i+" "+zero+" "+n/i);
        }
        System.out.println("Zeros : "+zero);
        sc.close();
    }
}
