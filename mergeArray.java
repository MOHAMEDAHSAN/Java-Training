public class mergeArray {
    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 55, 77,99,111};
        int[] arr1 = {2, 24, 26, 59, 60};
        int[] arr2 = new int[arr.length + arr1.length];

        int i = 0, j = 0, l1 = arr.length, l2 = arr1.length;

        for (int k = 0; k < arr2.length; k++) {
            if (i < l1 && (j >= l2 || arr[i] <= arr1[j])) {
                arr2[k] = arr[i];
                i++;
            } else {
                arr2[k] = arr1[j];
                j++;
            }
        }

        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
    }
}
