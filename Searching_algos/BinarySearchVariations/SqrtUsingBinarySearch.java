public class SqrtUsingBinarySearch {
    public static void main(String[] args) {
        int sq = 121;

        System.out.println("Squareroot: " + bruteForce(sq));
    }

    public static int bruteForce(int sq) {

        // loop upto i*i <= sqrt, sqrt = 1 is always valid
        int sqrt = -1;
        for (int i = 1; i <= sq / i; i++) {
            sqrt = i;
        }

        return sqrt;
    }

    public static int sqrtUsingBinary(int sq) {
        int low = 1;
        int high = sq;
        int sqrt = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= sq / mid) {
                sqrt = mid;
                low = mid + 1;
            } else
                high = mid - 1;

        }

        return sqrt;
    }
}
