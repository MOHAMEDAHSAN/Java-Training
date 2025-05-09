public class exceptionHandling {
    public static void main(String[] args) {
        int a=5,b=0;
        int div=0;
        try{
            div=a/b;
            System.out.println(div);
        }
        catch(ArithmeticException exception){
            System.out.println("Error - Enter valid Nos");
            exception.printStackTrace();
        }
        finally{
            System.out.println("Thank you");
        }
    }
}
