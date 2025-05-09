import java.util.*;
public class Reverse {

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0,temp=n,flag=0;
    sc.close();
    while(rev<temp){
        System.out.println(rev+" "+temp);
        rev=rev*10+temp%10;
        temp=temp/10;

    }
    if (rev==temp || rev/10==temp ){
        System.out.println("Palindrome : "+rev+" "+temp);
        flag=1;
    }
    if (flag==0){
        System.out.println("Nope : "+rev+" "+temp);
    }

    }
    
}
