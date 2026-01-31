public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int minimumDays = bruteForceMinimumDaysToMakeBouquets(arr, 3, 2);
        System.out.println(minimumDays);
        int minimumDays1 = minimumDays(arr, 3, 2);
        System.out.println(minimumDays1);

    }

    public static int bruteForceMinimumDaysToMakeBouquets(int[] arr, int k, int m) {
        if (m * k > arr.length)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        for (int i = min; i <= max; i++) {
            int consecutive = 0;
            int bouquets = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j]) {
                    consecutive++;
                    if (consecutive == k) { // If collected k adjacent flowers
                        // increment bouquets & reset consecutive because those flowers are “used”
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    // Adjacency is broken so reset
                    consecutive = 0;
                }
            }
            // at the end of each day check
            if (bouquets >= m)
                return i;
        }

        return -1;

    }

    public static int minimumDays(int[] arr, int k, int m) {
        if (m * k > arr.length)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        int low = min;
        int high = max;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMake(arr, mid, k, m)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canMake(int[] arr, int day, int k, int m) {
        int consecutive = 0;
        int bouquets = 0;
        for (int x : arr) {
            if (x <= day) {
                consecutive++;
                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;
                } 
            }else {
                    consecutive = 0;
                }
        }

        return bouquets >= m;
    }
}
