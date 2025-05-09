public class recursionNum {
    public static void nums(int start,int end){
        if (start==end+1){
            return;
        }
        
        nums(start+1,end);
        System.out.print(start+" ");
    }
    public static void main(String[] args) {
    nums(1,100);

    }
}
