import java.util.*;

public class adt {
    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[5];

    static int[] add(int[] arr) {
        int len = getSize(arr);
        int num = sc.nextInt();
        int[] arr1 = new int[arr.length * 2];
        int i = 0, flag = 0;
        for (i = 0; i < len; i++) {
            if (num < arr[i] && flag == 0) {
                arr1[i] = num;
                flag = 1;
                arr1[i + 1] = arr[i];
            } else {
                arr1[i + flag] = arr[i];
            }
        }
        if (flag == 0) {
            arr1[len] = num;
        }
        return arr1;
    }

    static void display(int[] arr) {
        int n = getSize(arr);
        System.out.println("Display :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int getSize(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr = add(arr);
        display(arr);
        arr = add(arr);
        display(arr);
    }
}
