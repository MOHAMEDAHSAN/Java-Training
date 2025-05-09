public class bitwiseJava {
    public static void main(String[] args) {
        int a=6;
        // System.out.println("AND "+(a&b));
        // System.out.println("OR "+(a|b));
        // System.out.println("XOR "+(a^b));
        // System.out.println("NOT "+(~a));
        // if ((a & 1)==1){
        //     System.out.println("Odd");
        // }
        // else{
        //     System.out.println("Even");
        // }
        String n=Integer.toBinaryString(a);
        String m=Integer.toBinaryString(-a);
        
        String neg="1000000000000000000000000000000";
        int num=Integer.parseInt(neg,2);
        System.out.println(n);
        System.out.println(m);
        System.out.println(num);
    }
}
