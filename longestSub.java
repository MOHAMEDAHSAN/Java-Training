import java.util.HashMap;

public class longestSub {
    public static void main(String[] args) {
        String in="abdbdcba";

        int max=0;
        int left=0;
        int fl=0,fr=0;


        HashMap<Character, Integer> pos= new HashMap<>();

        for(int right=0;right<in.length();right++)
        {
            char current = in.charAt(right);
            if(!pos.containsKey(current)){
                pos.put(current,right);
            }
            else{
                left=Math.max(left,pos.get(current)+1);
                pos.put(current,right);
            }
            max=Math.max(max,(right-left)+1);
            if (max==(right-left+1)){
                fl=left;
                fr=right;
                
            }
        }    
        
        for(int i=fl;i<fr;i++){
                    System.out.print(in.charAt(i));
                }
                System.out.println();
        System.out.println("Max "+max);
    }
}
