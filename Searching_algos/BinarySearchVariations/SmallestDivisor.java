public class SmallestDivisor {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 5, 9 };
        int threshold = 6;
        int ans = bruteApproach(numbers, threshold);
        System.out.println(ans);
        int ans1 = binaryApproach(numbers, threshold);
        System.out.println(ans1);
    }

    public static int bruteApproach(int[] arr, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int el : arr) {
            max = Math.max(el, max);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= max; i++) {
            int sum = 0;
            for (int el : arr) {
                // sum += Math.ceil((double) el / i);
                sum += (el + i - 1) / i;
            }
            if (sum <= threshold) {
                // its starting from 1 so its already the smallest divisor no need to chk for
                // larger numers.
                return i;
            }
        }

        return ans;
    }

    public static int binaryApproach(int[] arr, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int el : arr) {
            max = Math.max(el, max);
        }
        int low = 1;
        int high = max;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canDivide(arr, mid, threshold)) {
                ans = mid;
                high = mid - 1; // try smaller divisor
            } else
                low = mid + 1; // need larger divisor

        }

        return ans;
    }

    public static boolean canDivide(int[] arr, int divisor, int threshold) {
        long sum = 0; // to avoid overflow
        for (int el : arr) {
            sum += (el + divisor - 1) / divisor;
            if (sum > threshold)
                return false; // early stop no need to go furthur
        }

        return sum <= threshold;
    }
}
