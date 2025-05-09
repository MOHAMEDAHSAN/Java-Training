import java.util.Scanner;

public class switchDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Mon - Work");
                break;
            case 2:
                System.out.println("Tue - Work");
                break;
            case 3:
                System.out.println("Wed - Work");
                break;
            case 4:
                System.out.println("Thurs - Work");
                break;
            case 5:
                System.out.println("Fri - Work");
                break;
            case 6:
                System.out.println("Sat - Holiday");
                break;
            case 7:
                System.out.println("Sun - Holiday");
                break;
            default:
                System.out.println("Not valid");
        }
        sc.close();
    }
}

