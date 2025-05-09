import java.util.Scanner;
public class cubeRootIrrational {
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt(); 
        double left=0;
        double right=n;
        double mid;
        while(left<=right){
            mid=(left+right)/2;
            if((mid*mid*mid>=n-0.01 && mid*mid*mid<=n) || (mid*mid*mid>=n && mid*mid*mid<=n+0.01) ||(mid*mid*mid==n) ){
                System.out.print("Cube root is "+mid);
                break;
            }
            else if(mid*mid*mid<=n){
                left=mid;
            }
            else if (mid*mid*mid>=n){
                right=mid;
            }
            System.out.print(mid+" ");
        }
        sc.close();
    }
}