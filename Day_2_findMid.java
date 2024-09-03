// *******************Practice Question 2*************//

// You are given an unsorted array of integers. 
// Your task is to find the median of the array. 
// The median is the middle value in an ordered list of numbers. 
// If the list has an even number of elements, 
// the median is the average of the two middle numbers.

// Implement a function that returns the median of the array without explicitly sorting the entire array.

import java.util.Scanner;

public class Day_2_findMid {

    public static double findMid(int arr[]) {

        int n = arr.length;
        int midIndex = n / 2;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (n % 2 == 0) {
            // If even, median is the average of the two middle elements
            return (arr[midIndex - 1] + arr[midIndex]) / 2.0;

        } else {
            // If odd, median is the middle element
            return arr[midIndex];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the size of the array :");

        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element No " + (i + 1) + " :");
            arr[i] = sc.nextInt();

        }
        

        System.out.println(findMid(arr));

    }

}
