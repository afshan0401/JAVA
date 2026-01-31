public class PeakElement {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 3 };

        int el = minElement(arr);
        System.out.println("Peak element = " + el);
    }

    public static int minElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1])
                low = mid + 1;
            else
                high = mid;
        }

        return arr[low];
    }
}
