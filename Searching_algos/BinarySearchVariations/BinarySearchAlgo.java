public class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int index = binarySearch(arr, 3);
        int index1 = binarySearchRecursive(arr, 0, arr.length - 1, 3);

        System.out.println(index);
        System.out.println(index1);
    }

    public static int binarySearch(int arr[], int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == value)
                return mid;
            else if (value > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;
        else if (target > arr[mid])
            return binarySearchRecursive(arr, mid + 1, high, target);
        else
            return binarySearchRecursive(arr, low, mid - 1, target);
    }
}