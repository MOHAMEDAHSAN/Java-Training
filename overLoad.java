//3 - return type, no of parameters, type of parameters

public class overLoad {
    public static void main(String[] args) {
        calculate(3.2,2);
        calculate(3,2.2);
        calculate(3.2,2.3);
        calculate(3);
        calculate("Hi");
    }
    public static void calculate(int a,double b) {
        System.out.println(a*b);
    }
    public static void calculate(double a,double b) {
        System.out.println(a*b);
    }
    public static void calculate(double a,int b) {
        System.out.println(a*b);
    }
    public static void calculate(int a) {
        System.out.println(a*a);
    }
    public static void calculate(String a) {
        System.out.println(a);
    }
}
