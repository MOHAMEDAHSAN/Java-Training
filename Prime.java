import java.util.*;
public class Prime {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int flag;
        int iter=0;
        for(int i=2;i<=n;i++){
            flag=1;
            iter++;
            for(int j=2;j<=(i/2)+1;j++){
                    iter++;
                if (i%j==0 & i!=j) {
                    flag=0;
                    break;
                }

            }
            
            if (flag==1){
            System.out.println("Prime : "+i );}
        }
        System.out.println("Iter : "+iter );
    }
}

