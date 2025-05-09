import java.util.Scanner;

public class complement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String n=Integer.toBinaryString(num);
        // n=n.replaceAll("1", "2");
        // n=n.replaceAll("0", "1");
        // n=n.replaceAll("2", "0");
        // System.out.println(n);

        //complement
        int n1=Integer.parseInt(n);
        System.out.println(n1);
        while(n1!=0){


            
        }



        //reverse
        int num1=num,output=0;
        for(int i=0;i<31;i++){
            int last=num1&1;

            if(output!=0){
                output=output<<1;                
            }
            if(last==1){
                output=output|1;
            }
            num1=num1>>1;
        }
        System.out.println(output);
        sc.close();
    }
}
