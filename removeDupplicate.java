public class removeDupplicate {
    public static void main(String[] args) {
        int arr[]={1,2, 4, 3, 6, 5, 4};
        int flagAs=1,flagDe=1,i=0;
        while(i!=arr.length-1){
            if (arr[i]>arr[i+1]){
                flagAs=0;
            }
            if (arr[i]<arr[i+1]){
                flagDe=0;
                
            }
            i++;
        }
        
        
        System.out.println(flagAs|flagDe);
    }
}
