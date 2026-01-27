public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int minimumDays = bruteForceMinimumDaysToMakeBouquets(arr, 3, 2);
        System.out.println(minimumDays);

    }

    public static int bruteForceMinimumDaysToMakeBouquets(int[] arr, int k, int m) {
        if (m * k > arr.length)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
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
}
