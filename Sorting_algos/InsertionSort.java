import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        InsertionSort is = new InsertionSort();
        // is.insertionSortUsingSwapping(arr);
        is.insertionSortUsingShifting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void insertionSortUsingSwapping(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    // This version inserts the current element by swapping it left step-by-step
    // Range idea:
    // Sorted part -> indices [0 ... i-1]
    // Unsorted part -> indices [i ... n-1]

    /*
     * private void insertionSortUsingSwapping(int[] arr) {
     * int n = arr.length;
     * 
     * // i represents the start of the UNSORTED part
     * // At each step, element at index i will be inserted into the sorted part
     * for (int i = 0; i < n; i++) {
     * 
     * // j is used to move the current element left into the sorted part
     * int j = i;
     * 
     * // While:
     * // 1) j > 0 -> we are not outside the array on the left
     * // 2) arr[j-1] > arr[j] -> left element is bigger than current element
     * // This means current element is not at correct position yet
     * while (j > 0 && arr[j - 1] > arr[j]) {
     * 
     * // Swap the element with its left neighbor
     * // This moves the current element one step left
     * int temp = arr[j - 1];
     * arr[j - 1] = arr[j];
     * arr[j] = temp;
     * 
     * // Move j left to continue checking further into the sorted part
     * j--;
     * }
     * // After while loop:
     * // Element originally at index i is now placed in its correct position
     * // Range [0 ... i] is now sorted
     * }
     * }
     */

    private void insertionSortUsingShifting(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            // insert key
            arr[j + 1] = key;
        }
    }

    /*
     * // This version inserts the element by shifting larger elements right
     * // Range idea:
     * // Sorted part -> indices [0 ... i-1]
     * // Unsorted part -> indices [i ... n-1]
     * 
     * private void insertionSortUsingShifting(int[] arr) {
     * int n = arr.length;
     * 
     * // Start from index 1 because a single element (index 0) is already sorted
     * for (int i = 1; i < n; i++) {
     * 
     * // key = element to be inserted into the sorted part
     * int key = arr[i];
     * 
     * // j starts from the last index of the sorted part
     * int j = i - 1;
     * 
     * // While:
     * // 1) j >= 0 -> we are still inside the sorted part
     * // 2) arr[j] > key -> current sorted element is bigger than key
     * // This means key should be placed before arr[j]
     * while (j >= 0 && arr[j] > key) {
     * 
     * // Shift the bigger element one position to the right
     * // This creates space (a "hole") for inserting key later
     * arr[j + 1] = arr[j];
     * 
     * // Move left to compare key with previous sorted elements
     * j--;
     * }
     * 
     * // Insert key into the correct position (the hole created)
     * // j+1 is the index where key belongs
     * arr[j + 1] = key;
     * 
     * // After this:
     * // Range [0 ... i] is sorted
     * }
     * }
     * 
     */

}
