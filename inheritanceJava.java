public class inheritanceJava{
    public static void main(String[] args) {
        user me = new user("Md");
        me.sayName();
        me.mailCheck();
        me.name="Ahsan";
        me.setPetId("A12");
        me.sayName();
        me.sayPetId();
        me.mailCheck();
    }
}

abstract class all{
    int id;
    String mail;
    protected String name;
    int Ph;
    void sayName(){
        System.out.println("Hi "+name);

    }

    public abstract void mailCheck();
    
} 

class user extends all{
    private String petId;
    void setPetId(String petId){
        this.petId=petId;
    }
    void sayPetId(){
        System.out.println(petId);
    }
    @Override
    void sayName(){
        System.out.println(name);
    }
    user(String name){
        this.name=name;
    }
    @Override
    public void mailCheck() {
       if (this.name.length()>3){
            System.out.println("Valid");
       }
       else{
        System.out.println("Invalid");
       }
    }
    
}


class pet extends all{
    String breed;
    String userId;
    @Override
    public void mailCheck() {
       if (this.name.length()>3){
            System.out.println("Valid");
       }
       else{
        System.out.println("Invalid");
       }
    }
}
