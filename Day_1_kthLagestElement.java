import java.util.Scanner;

public class Day_1kthLagestElement {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k (for the k-th largest element): ");
        int k = sc.nextInt();
        int arr[] = { 2, 3, 8, 1, 6 };
        
        if (k > 0 && k <= arr.length) {
            bubbleSort(arr);
            System.out.println("The " + k + "-th largest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid input! Please enter a value of k between 1 and " + arr.length);
        }
        
        sc.close();
    }
}
