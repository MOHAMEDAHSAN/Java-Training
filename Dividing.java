import java.util.Scanner;

public class Dividing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        int quotient=0;
        while(dividend>=divisor){
            dividend=dividend-divisor;
            quotient=quotient+1;
        }
        System.out.println("Quotient : "+quotient+" Remainder : "+dividend+" Dividend : "+(divisor*quotient+dividend)+" Divisor : "+divisor);
        sc.close();

    }
}
