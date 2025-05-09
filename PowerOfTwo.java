public class PowerOfTwo {
    public static void main(String[] args) {
        int input = 80;
        if((input & (input-1)) == 0) {
            System.out.println("Yes a pwer of 2");
        }
        else {
            System.out.println( "Not a pwer of 2");
        }
    }
}
