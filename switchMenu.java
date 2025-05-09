import java.util.Scanner;

public class switchMenu {

    public static void add(int a, int b) {
        System.out.println("SUM: " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("DIFFERENCE: " + (a - b));
    }


    public static void multiply(int a, int b) {
        System.out.println("PRODUCT: " + (a * b));
    }

    public static void divide(int a, int b) {
        if (b != 0) {
            System.out.println("QUOTIENT: " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            System.out.print("No-1: ");
            int a = sc.nextInt();

            System.out.print("No-2: ");
            int b = sc.nextInt();

            System.out.print("Choose Option (1: Add, 2: Subtract, 3: Multiply, 4: Divide, 5: Quit): ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    add(a, b);
                    break;
                case 2:
                    subtract(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Not valid");
                    break;
            }
        }

        sc.close();
    }
}
