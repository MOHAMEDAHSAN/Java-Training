public class extraChar {
    public static void main(String[] args) {
        String s1="hello";
        String s2="helllo";

        char result=0;

        String concat=s1+s2;
        char[] chars=concat.toCharArray();
        
        for (int i=0;i<chars.length;i++){
            // result^=chars[i];
            result=(char)(result^chars[i]);
            
        }
        System.out.print(result+" ");
    }
}
