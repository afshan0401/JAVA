public class ClosestElementBS {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 8 };
        int target = 6;

        System.out.println("Closest el: " + closestElement(arr, target));

    }

    /*
     * Final clear rule:
     * If target exists:
     * closest = target
     * 
     * If target does NOT exist:
     * Binary search ends with:
     * 
     * high = just smaller element
     * low = just larger element (coz low has crossed high thats why while stopped)
     */
    public static int closestElement(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid]; // exact match is closest
            } else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        // edhe cases
        if (high < 0)
            return arr[0]; // target smaller than all
        if (low >= arr.length)
            return arr[arr.length - 1]; // target smaller than all

        // compare el at high and low
        if (Math.abs(arr[high] - target) <= Math.abs(arr[low] - target)) {
            return arr[high];
        } else
            return arr[low];
    }
}
