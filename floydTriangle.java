import java.util.*;
public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=1;
        for(int i=1;i<=n;i++){

            System.out.print(" ".repeat(n - i));
            for(int k=1;k<=i;k++){
                System.out.print(j+" ");
            j++;
        }
        System.out.println();
    }
        sc.close();
    }
}
