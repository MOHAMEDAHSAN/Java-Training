public class trying {
    public static void incr(int i){
        i++;
        System.out.println(i);
    }
    public static void incr(Integer i){
        i++;
        System.out.println(i);
    }
    public static void main(String[] args) {
        int i=20;
        incr(i);
        System.out.println(i);
        Integer j=15;
        incr(j);
        System.out.println(j);

    }
}
