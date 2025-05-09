public class prefix {
    public static void main(String[] args) {
        String[] str={
            "flower",
            "flowfl",
            "fly",
            "flight"
        };
        String prefix=str[0];
        System.out.println(prefix);
        for (String i:str){
            while(i.indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.print(prefix);
        if (prefix.isEmpty()){
            System.out.println("No Prefix");
        }
    }
}
