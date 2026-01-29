import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr2 = { 9, 4, 7, 1, -25, 3, 6, 2, -7, 8, 5 };

        // recursiveBubbleSort(arr2, arr2.length);
        
        optimizedRecursiveBubbleSort(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }

    private static void recursiveBubbleSort(int[] arr, int n) {

        // base case - only 1 el left, already sorted
        if (n == 1)
            return;
        // one full bubble pass
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // for remaining part
        recursiveBubbleSort(arr, n - 1);
    }


    static void optimizedRecursiveBubbleSort(int[] arr, int n) {
        // Base case
        if (n == 1) return;

        boolean didSwap = false; // Track if any swap occurred

        // Perform one pass of bubble sort
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = true;
            }
        }

        // If no swaps were made, the array is already sorted
        if (!didSwap) return;

        // Recur for remaining elements
        optimizedRecursiveBubbleSort(arr, n - 1);
    }


}
