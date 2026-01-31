public class FloorAndCeil {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 4, 5, 6, 6, 7 };

        int floor = floorBinarySearch(arr, 3);
        System.out.println("Floor " + floor);
        int ceil = ceilBinarySearch(arr, 3);
        System.out.println("Ceil " + ceil);

    }

    public static int floorBinarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                ans = mid;
                low = mid + 1;  // move right in floor
            } else
                high = mid - 1;
        }

        return ans;
    }

    public static int ceilBinarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1; //move left in ceil
            } else
                low = mid + 1;
        }

        return ans;
    }
}
