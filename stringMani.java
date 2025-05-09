public class stringMani {
    public static void main(String[] args) {
        String name="Ramesh";
        name="Raamesh";
        String emp="Raamesh";
        String n_emp=new String("Raaamesh");
        System.out.println(name==emp);
        System.out.println(name=="Raamesh");
        System.out.println(name==n_emp);
        System.out.println(n_emp=="Raaamesh");
        System.out.println(name.equals(n_emp));

        StringBuilder builder =new StringBuilder("Numbers are:");
        long start= System.nanoTime();
        for (int i=1;i<21;i++){
            builder.append(" "+i);
        }
        long end=System.nanoTime();
        System.out.println((end-start));
        System.out.println(builder.capacity());
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        System.out.println(builder.toString());
    }
}
