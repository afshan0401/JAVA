import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
// insertionSortRecursive(arr, arr.length-1);
 insertionSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSortRecursive(int[] arr, int i) {
    // Base case: only one element → already sorted
    if (i == 0) return;

    // Recursively sort first i-1 elements
    insertionSortRecursive(arr, i - 1);

    // insert arr[i] into correct position
    int j = i;
    while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
    }
}

static void insertionSort(int[] arr, int i, int n) {
        // Base case
        if (i == n) return;

        int j = i;
        // Move the current element back until it's in the correct place
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recur for the next index
        insertionSort(arr, i + 1, n);
    }


}
