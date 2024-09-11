public class Day_3_FindDuplicate {
    public static int findDuplicate(int[] arr) {
        // step1: Tortoise and Hare (Floyd's Algorithm)
        int slow = arr[0];
        int fast = arr[0];

        // Move slow pointer one step and fast pointer two steps at a time
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);   
        // step2: Finding the entry point of the cycle
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;  
    }

    public static void main(String[] args) {
        // Test case1
        System.out.println("Test case1");
        int[] arr1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + findDuplicate(arr1));  
        System.out.println("Test case2");


        int[] arr2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number: " + findDuplicate(arr2));  
        System.out.println("Test case3");


        int[] arr3 = {1, 1};
        System.out.println("Duplicate number: " + findDuplicate(arr3));

        System.out.println("Test case4");

        int[] arr4 = {1, 4, 4, 2, 3};
        System.out.println("Duplicate number: " + findDuplicate(arr4)); 

       
        int[] arr5 = new int[100001];
        for (int i = 1; i < 100000; i++) {
            arr5[i] = i;
        }
        arr5[100000] = 50000;
        System.out.println("Duplicate number: " + findDuplicate(arr5)); // Output: 50000
    }
}
