public class MissingKthElementBS {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        int kEl = missingKthUsingBS(arr, k);
        System.out.println("Missing el: " + kEl);

    }

    public static int missingKthUsingBS(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);
            if (missing < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low + k;
    }

    public static int bruteApproac(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k)
                k++;
            else
                return k;
        }
        return k;
    }
}
