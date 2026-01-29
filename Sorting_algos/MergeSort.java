import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        mergeSortAlgo(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = { 1, 2, 3, 4, 5 };
        mergeSortAlgo(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {9, 4, 7, 1,-25, 3, 6, 2,-7, 8, 5};
        mergeSortAlgo(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));



    }

    public static void mergeSortAlgo(int[] arr, int low, int high) {
        if (low >= high)
            return; // base case
        int mid = low + (high - low) / 2;

        mergeSortAlgo(arr, low, mid); // left half (subarray)
        mergeSortAlgo(arr, mid + 1, high); // right half

        mergeAlgo(arr, low, mid, high); // call merge algo when got left adn right half back
    }

    private static void mergeAlgo(int[] arr, int low, int mid, int high) {

        int left = low; // start pointer of left part [low to mid]

        int right = mid + 1; // start pointer for right part [mid+1 to high]

        int i = 0; // tempArray pointer

        // [] high - low + 1]size of subarray being merged
        int[] tempArray = new int[high - low + 1];

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tempArray[i] = arr[left];
                left++;
            } else {
                tempArray[i] = arr[right];
                right++;
            }
            i++;
        }

        // if elements left in left element (assuming right is empty)
        while (left <= mid) {
            tempArray[i] = arr[left];
            left++;
            i++;

        }

        // if elements left in left element (assuming right is empty)
        while (right <= high) {
            tempArray[i] = arr[right];
            right++;
            i++;
        }

        // copy elements back from tempArray to subarray
        for (int j = 0; j < tempArray.length; j++) {
            // j + low coz low points to the correct start of the subarray here the subarray
            // is part of bigger array so we got to account for it to insert in correct
            // place.
            arr[j + low] = tempArray[j];
        }

    }
}
