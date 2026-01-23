public class FirstAndLastAndCountOccurence {
    public static void main(String[] args) {

        int arr[] = { 0, 1, 3, 3, 3, 3, 3, 3, 4, 5, 6, 6, 7 };

        int first = firstOccurence(arr, 3);
        System.out.println("first " + first);
        
        int last = lastOccurence(arr, 3);
        System.out.println("last " + last);

        int count = countOccurence(first, last);
        System.out.println("Total occurence: " + count);
    }

    public static int firstOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int countOccurence(int first, int last) {
        if (first == -1)
            return 0;
        else
            return last - first + 1;
    }
}
