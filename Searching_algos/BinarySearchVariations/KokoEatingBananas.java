public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        int k = bruteApproach(piles, h);
        System.out.println("minimum bananas: " + k);

        int kk = calcBananasPerHour(piles, h);
        System.out.println("minimum bananas: " + kk);
    }

    public static int calcBananasPerHour(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int p : piles) {
            high = Math.max(p, high);
        }
        int k = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = 0;
            for (int p : piles) {
                hours += (p + mid - 1) / mid;
                if (hours > h)
                    break;
            }

            if (hours <= h) {
                k = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return k;

    }

    public static int bruteApproach(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(pile, max);
        }

        for (int k = 1; k <= max; k++) {
            int hours = 0;

            for (int pile : piles) {
                // ceil(a / b) = (a + b - 1) / b always mathematically true
                hours += (pile + k - 1) / k;
                // hours += (int) Math.ceil((double) pile / k); this can be used too
            }

            if (hours <= h)
                return k;
        }

        return -1; // never happens logically
    }
}
