import java.util.Scanner;

public class diff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num1=sc.nextLine();
        String num2=sc.nextLine();
        int min=Math.min(num1.length(),num2.length());
        int max=Math.max(num1.length(),num2.length());
        System.out.println("DIFFERENT CHARS : ");
        for(int i=0;i<(min);i++){
            if(num1.charAt(i)!=num2.charAt(i)){
                System.out.print(num1.charAt(i)+" "+num2.charAt(i)+" ");
            }
        }
        for(int i=min;i<max;i++){
            try{
                System.out.print(num1.charAt(i)+" ");
            }
            catch(StringIndexOutOfBoundsException exception){

            }
            try{
                System.out.print(num2.charAt(i)+" ");
            }
            catch(StringIndexOutOfBoundsException exception){

            }

        }

        sc.close();
    }
}
