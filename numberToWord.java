import java.util.Scanner;
public class numberToWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int org=sc.nextInt();
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int n=org;
        System.out.println(n);
        if (n>1000){
            System.out.print(ones[n/1000]+" thousand ");
            n=n%1000;
        }

        if (n>100){
            System.out.print(ones[n/100]+" hundred ");
            n=n%100;
        }

        if (org>100 & n!=0){
            System.out.print("and ");
        }

        if (n>20){
            System.out.print(tens[n/10]+" ");
            System.out.print(ones[n%10]);
        }
        else if (n>1){
            System.out.print(ones[n]);
        }
        sc.close();
    }
}
