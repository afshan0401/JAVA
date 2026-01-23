public class RotatedArraySearch {
    public static void main(String[] args) {

        int arr[] = { 6, 3, 7, 8, 1, 3, 5 };
        
        int index = searchInRotatedSortedArrayNoDuplicates(arr, 3);
        System.out.println("Present at index: "+ index);
        
        int arr1[] = { 6, 3, 7, 8, 1,1, 3, 5 };
        boolean flag = searchInRotatedSortedArrayWithDuplicates(arr1, 1);
        System.out.println("Present : "+flag);

    }

    public static int searchInRotatedSortedArrayNoDuplicates(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;

            // left is sorted

            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1; // move left and eliminate right array part
                } else {
                    low = mid + 1;
                }
            }
            // right is sorted
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1; // move right and eliminate left array part
                } else {
                    high = mid - 1;
                }

            }
        }

        return -1;

    }

    public static boolean searchInRotatedSortedArrayWithDuplicates(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return true;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            } else if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }

        }

        return false;
    }
}