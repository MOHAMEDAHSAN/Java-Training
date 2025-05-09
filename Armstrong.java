import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int n=1;n<=m;n++){
        int temp = 1, c = 0, arm = 0;
        // while(true){
        // temp=temp*10;
        // c++;
        // if (n<temp){
        // break;
        // }
        // }
        c = (int) Math.log10(n) + 1;
        temp = n;
        while (temp != 0) {
            arm = arm + (int) Math.pow(temp % 10, c);
            temp = temp / 10;
        }
        if (arm==n)System.out.println("Org : " + n + " Processed : " + arm + " Is Armstrong : " + (arm == n));
        sc.close();
    }
    }
}
