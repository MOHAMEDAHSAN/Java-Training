import java.util.*;

public class Multiples {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int res=0;
        for(int i=0;i<m;i++){
            res=res+n;
            System.out.print(res+" ");
        }
        sc.close();
    }

}
