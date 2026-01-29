import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = { 9, 4, 7, 1, -25, 3, 6, 2, -7, 8, 5 };
        quickSortAlgo(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortAlgo(int[] arr, int low, int high) {

        // Base condition: only sort if at least 2 elements exist
        if (low < high) {

            int partitionIndex = partition(arr, low, high);

            // left side of pivot
            quickSortAlgo(arr, low, partitionIndex - 1);
            // right side of pivot
            quickSortAlgo(arr, partitionIndex + 1, high);
        }
    }

    // Partition function using FIRST element as pivot
    private static int partition(int[] arr, int low, int high) {

        // first element as pivot
        int pivot = arr[low];

        // scans from left side
        int i = low;

        // scans from right side
        int j = high;

        // Continue until both pointers cross
        while (i < j) {

            // Stops when element > pivot is found (1st element greater than pivot)
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            // Stops when element <= pivot is found (1st element smaller than pivot)
            while (arr[j] > pivot && j > low) {
                j--;
            }

            // If pointers have not crossed, swap misplaced elements
            // we swap multiple times but only stop when i crosses j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot into its correct sorted position
        // All elements on left of j are <= pivot
        // All elements on right of j are > pivot
        int temp = arr[low]; // arr[low] is pivot
        arr[low] = arr[j];
        arr[j] = temp;

        // Return final position of pivot
        return j;
    }
}
