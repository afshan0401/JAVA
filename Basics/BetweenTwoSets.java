import java.util.*;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int start = Collections.max(a); // largest in A
        int end = Collections.min(b); // smallest in B
        int count = 0;

        for (int i = start; i <= end; i++) {
            boolean valid = true;

            // Condition 1: A elements divide i
            for (int n : a) {
                if (i % n != 0) {
                    valid = false;
                    break;
                }
            }
            // only checks if earlier condition checks out
            // Condition 2: i divides B elements
            if (valid) {
                for (int m : b) {
                    if (m % i != 0) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid)
                count++; // only if both condition checks out
        }

        return count;
    }

    public static void main(String[] args) {

        // SAMPLE INPUT
        List<Integer> a = Arrays.asList(2, 6);
        List<Integer> b = Arrays.asList(24, 36);

        // CALL FUNCTION
        int result = getTotalX(a, b);

        // PRINT OUTPUT
        System.out.println("Numbers between sets = " + result);
    }
}
