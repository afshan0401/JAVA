public class MinimumCapacityOfShip {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // here sorted but can be unsorted and order must be followed
        int days = 5;

        int[] weights2 = { 3, 2, 2, 4, 1, 4 };
        int days2 = 3;

        int minCapacity = bruteApproach(weights, days);
        System.out.println(minCapacity);

        int minCapacity3 = binaryApproach(weights, days);
        System.out.println(minCapacity3);

        int minCapacity2 = bruteApproach(weights2, days2);
        System.out.println(minCapacity2);
    }

    public static int bruteApproach(int[] weights, int D) {
        int min = 0;
        int max = 0;
        for (int w : weights) {
            min = Math.max(w, min);
            max += w;
        }

        for (int i = min; i <= max; i++) {
            int currentLoad = 0; // how much weight is loaded on ship today
            int days = 1; // how many days have been used so far
            // always start: Day 1, Ship is empty
            for (int w : weights) {
                if (currentLoad + w <= i) // chk if adding next weight exceeds capacity
                    currentLoad += w; // if doesn't exceed add to currentLoad of the day
                else {
                    // If adding this package would exceed capacity:
                    // move to next day
                    // put this package on the new day’s ship
                    days++;
                    currentLoad = w; // add the w to the next day already meaning start a new day carrying the next package
                }
            }
            // after checking all packages in inner loop if days exceeds start from day 1
            if (days <= D)
                return i;
        }

        return -1;
    }

    public static int binaryApproach(int[] weights, int D) {
        int min = 0;
        int max = 0;
        for (int w : weights) {
            min = Math.max(w, min);
            max += w;
        }
        int low = min;
        int high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, mid, D)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }

    public static Boolean canShip(int[] weights, int capacity, int D) {
        int days = 1;
        int currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w <= capacity) {
                currentLoad += w;
            } else {
                days++;
                currentLoad = w;
            }
        }

        return days <= D;
    }
}
