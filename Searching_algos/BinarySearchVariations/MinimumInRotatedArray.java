public class MinimumInRotatedArray {
    public static void main(String[] args) {

        int arr[] = { 6, 3, 7, 8, 1,2 , 3, 5 };

        int el = minElement(arr);
        System.out.println("Minimum element = " + el);
    }

    public static int minElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        return arr[low];
    }
}
