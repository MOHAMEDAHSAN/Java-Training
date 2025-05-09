public class eleArray {
    public static int sum(int[] arr,int n){
        if (n==0){
            return arr[n];
        }
        return arr[n]+sum(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(sum(arr,arr.length-1));;
    }
}
