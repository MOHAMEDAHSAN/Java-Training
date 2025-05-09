import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        int num,flag=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        
        String n=Integer.toBinaryString(num);
        System.out.println("Number : "+num);
        for(int digit=0;digit<n.length();digit++){
            if (flag==1 & n.charAt(digit)=='1' ){
                System.out.println("Nope");
                flag=2;
                break;
            }
            if ((flag==0 & n.charAt(digit)=='1')){
                flag=1;
            }

    
        }
        if (flag==1){
            System.out.println("Yes");
        }
        
        sc.close();
    }
}
