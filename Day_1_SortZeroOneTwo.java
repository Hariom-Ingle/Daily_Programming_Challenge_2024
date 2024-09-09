import java.util.Arrays;

public class Day_1_SortZeroOneTwo {

    public static void sort(int[] arr) {
        int left = 0, right = arr.length - 1, current = 0;

        while (current <= right) {
            if (arr[current] == 0) {
                 
                swap(arr, left, current);
                left++;   
                current++;   
            } else if (arr[current] == 1) {
                current++;
            } else {
                swap(arr, current, right);
                right--;   
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
         
        int[] testArray1 = {0, 1, 2, 1, 0, 2, 1, 0};
        System.out.println("Test Case 1");
        System.out.println("Input: " + Arrays.toString(testArray1));
        sort(testArray1);
        System.out.println("Output:  " + Arrays.toString(testArray1));
        System.out.println();


        System.out.println("Test Case 2");
        int[] testArray2 = {2, 2, 2, 2};
        System.out.println("Input: " + Arrays.toString(testArray2));
        sort(testArray2);
        System.out.println("Output:  " + Arrays.toString(testArray2));
        System.out.println();

        System.out.println("Test Case 3");
        int[] testArray3 = {0, 0, 0, 0};
        System.out.println("Input: " + Arrays.toString(testArray3));
        sort(testArray3);
        System.out.println("Output:  " + Arrays.toString(testArray3));
        System.out.println();

        System.out.println("Test Case 4");
        int[] testArray4 = {1, 1, 1, 1};
        System.out.println("Input: " + Arrays.toString(testArray4));
        sort(testArray4);
        System.out.println("Output:  " + Arrays.toString(testArray4));
        System.out.println();

        System.out.println("Test Case 5");
        int[] testArray5 = {2, 0, 1};
        System.out.println("Input: " + Arrays.toString(testArray5));
        sort(testArray5);
        System.out.println("Output:  " + Arrays.toString(testArray5));
        System.out.println();

        System.out.println("Test Case 5");
        int[] testArray6 = {};
        System.out.println("Input: " + Arrays.toString(testArray6));
        sort(testArray6);
        System.out.println("Output:  " + Arrays.toString(testArray6));
    }
}
