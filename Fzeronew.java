public class Fzeronew {
    public static void main(String[] args) {
        int n=125;
        int count=0;
        while(n>0){
            count=count+(n/5);
            n=n/5;
        }
        System.out.println(count);
    }
}
