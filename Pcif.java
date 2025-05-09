import java.util.*;
public class Pcif {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int iter=0;
        Boolean[] arr=new Boolean[n];
        Arrays.fill(arr,Boolean.TRUE);
        for(int i=2;i*i<n;i++){
            iter++;
            if (arr[i]){
                for(int j=i*i;j<n;j++){
                    iter++;
                    if (j%i==0){
                        arr[j]=Boolean.FALSE;
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if (arr[i]){
            System.out.println(arr[i]+" "+i);
            }
        }
        System.out.println("Iter "+iter);
        sc.close();
    }
}
