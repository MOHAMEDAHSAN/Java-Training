import java.util.Scanner;

public class revBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String n=Integer.toBinaryString(num);
        String s="";
        for(int digit=n.length()-1;digit>=0;digit--){
            s=s+n.charAt(digit);
        }
        System.out.println(s);
    
        for(int digit=0;digit<=(30-n.length());digit++){
            s=s+"0";
        }
        System.out.println(s);
        System.out.println(Integer.parseInt(s,2));
        sc.close();
    }
}
