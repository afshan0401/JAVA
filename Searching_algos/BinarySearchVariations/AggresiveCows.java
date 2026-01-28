
import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] stalls = { 0, 3, 4, 7, 9, 10 };
        int cows = 4;
        System.out.println("Max dist: " + bruteApproach(stalls, cows));
        System.out.println("Max dist: " + binaryApproach(stalls, cows));

    }

    public static int bruteApproach(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int minDist = 1;
        int maxDist = stalls[stalls.length - 1] - stalls[0];
        // int ans = 0;

        for (int d = minDist; d <= maxDist; d++) {
            if (!canPlace(stalls, cows, d))
                // let's say last failed minDist is 4 so last possible was 3 so d-1 returned;
                return d - 1;
        }

        return maxDist;
    }

    private static boolean canPlace(int[] stalls, int cows, int d) {
        int cowCount = 1; //1st cow always goes at 1st index
        int previousCowStall = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - previousCowStall >= d) {
                cowCount++;
                previousCowStall = stalls[i];
            }
        }
        return cowCount >= cows;
    }

    public static int binaryApproach(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        // int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(stalls, cows, mid)) {
                // ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }

        // or return high directly (its last possible option)
        //at the end of loop high points to possibleMaxof min distances
        return high;
        // return ans;
    }
}
