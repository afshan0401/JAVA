
import java.util.HashMap;

public class LongestSubarrayPosNeg {
    public static void main(String[] args) {
        int[] arr = { 2, -1, 2, 1, -3, 4, -1, 2 };
        int K = 3;
        int currentSum = 0;
        int maxLength = 0;
        int start = -1;
        int end = -1;
        //we do not store frequncy
        // we do not overwrite later
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (map.containsKey(currentSum - K)) //There exists an index j such that: prefixSum[j] = currentSum - K

                {
                int prevIndex = map.get(currentSum - K);
                int len = i - prevIndex;

                if (len > maxLength) {
                    maxLength = len;
                    start = prevIndex + 1;
                    end = i;
                }
            }

            // stroe first occurence only
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        // print result
        if (start != -1) {
            System.out.println("longest subarray:");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");

            }
        }
    }
}
