import java.util.Arrays;

public class Day_4_MergeSortedArrays {

    // Helper function to find the next gap
    private static int nextGap(int gap) {
        if (gap <= 1) {
            return 0;
        }
        return (gap / 2) + (gap % 2); // Ceiling of gap/2
    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int gap = nextGap(m + n); // Total elements in both arrays

        while (gap > 0) {
            int i, j;

            // Compare and swap in arr1
            for (i = 0; i + gap < m; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }

            // Compare and swap between arr1 and arr2
            for (j = gap > m ? gap - m : 0; i < m && j < n; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            // Compare and swap in arr2
            if (j < n) {
                for (j = 0; j + gap < n; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }

            gap = nextGap(gap); // Reduce gap
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        merge(arr1, arr1.length, arr2, arr2.length);
        System.out.println("Test Case 1:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        // Test Case 2
        int[] arr1_2 = { 10, 12, 14 };
        int[] arr2_2 = { 1, 3, 5 };
        merge(arr1_2, arr1_2.length, arr2_2, arr2_2.length);
        System.out.println("Test Case 2:");
        System.out.println("arr1: " + Arrays.toString(arr1_2));
        System.out.println("arr2: " + Arrays.toString(arr2_2));

        // Test Case 3
        int[] arr1_3 = { 2, 3, 8 };
        int[] arr2_3 = { 4, 6, 10 };
        merge(arr1_3, arr1_3.length, arr2_3, arr2_3.length);
        System.out.println("Test Case 3:");
        System.out.println("arr1: " + Arrays.toString(arr1_3));
        System.out.println("arr2: " + Arrays.toString(arr2_3));

        // Test Case 4
        int[] arr1_4 = { 1 };
        int[] arr2_4 = { 2 };
        merge(arr1_4, arr1_4.length, arr2_4, arr2_4.length);
        System.out.println("Test Case 4:");
        System.out.println("arr1: " + Arrays.toString(arr1_4));
        System.out.println("arr2: " + Arrays.toString(arr2_4));

             // Test Case 5: Merging large arrays
             int[] arr1_5 = new int[100000];
             int[] arr2_5 = new int[50000];
             
             // Filling arr1 with values from 1 to 100000
             for (int i = 0; i < 100000; i++) {
                 arr1_5[i] = i + 1;
             }
             
             // Filling arr2 with values from 50001 to 100000
             for (int i = 0; i < 50000; i++) {
                 arr2_5[i] = i + 50001;
             }
     
             merge(arr1_5, 100000, arr2_5, 50000);
             
             System.out.println("Test Case 5:");
             System.out.println("First 10 elements of arr1: " + Arrays.toString(Arrays.copyOfRange(arr1_5, 0, 10)));
             System.out.println("First 10 elements of arr2: " + Arrays.toString(Arrays.copyOfRange(arr2_5, 0, 10)));

         
    }
}
