import java.util.*;

public class Day_5_findLeader {

    public static ArrayList<Integer> output = new ArrayList<>();
    // i has  used a  recursive approach but due to stack ovrflow  it could not execute  case no 5
    // Iterative function to find leaders/
    public static void findLeaders(int arr[]) {
        if (arr.length == 0) {
            return;
        }

        int maxFromRight = arr[arr.length - 1];
        output.add(maxFromRight);

        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >maxFromRight) {
                output.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        Collections.reverse(output);  
    }

    public static void printLeaders(int[] arr) {
        output = new ArrayList<>();
        findLeaders(arr);


        System.out.println(output);
    }

    public static void main(String[] args) {

        // Test case 1
        int arr0[] = { 1, 2, 3, 4, 0 };
        System.out.print("Input: " + Arrays.toString(arr0) + "\nOutput: ");
        printLeaders(arr0); 
        int arr1[] = { 7, 10, 4, 10, 6, 5, 2 };
        System.out.print("Input: " + Arrays.toString(arr1) + "\nOutput: ");
        printLeaders(arr1);  
        // Test case 3
        int arr2[] = { 5 };
        System.out.print("Input: " + Arrays.toString(arr2) + "\nOutput: ");
        printLeaders(arr2); 

        // Test case 
        int arr3[] = { 100, 50, 20, 10 };
        System.out.print("Input: " + Arrays.toString(arr3) + "\nOutput: ");
        printLeaders(arr3);  

        // Test case 4
        int arr4[] = new int[1000000];
        for (int i = 1; i <= 1000000; i++) {
            arr4[i - 1] = i;
        }
        System.out.print("Input: [1, 2, 3, ..., 1000000]\nOutput: ");
        printLeaders(arr4);  
    }
}
