
public class LowerAndUpperBound {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 5, 5, 6, 7 };
        int arr1[] = { 0, 1, 2, 3, 6, 7, 8, 8 };

        int lowerBoundIndex = lowerBoundBinarySearch(arr, 5);
        System.out.println("inserted at index " + lowerBoundIndex);
        int upperBoundIndex = upperBoundBinarySearch(arr, 5);
        System.out.println("inserted at index " + upperBoundIndex);

        System.out.println("----------------");

        int lowerBoundIndex1 = lowerBoundBinarySearch(arr1, 6);
        System.out.println("inserted at index " + lowerBoundIndex1);
        int upperBoundIndex1 = upperBoundBinarySearch(arr1, 6);
        System.out.println("inserted at index " + upperBoundIndex1);

    }

    public static int lowerBoundBinarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }

    public static int upperBoundBinarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }
}
