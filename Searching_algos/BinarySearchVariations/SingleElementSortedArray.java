public class SingleElementSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

        int index = bruteForce(arr);
        System.out.println("Single element: " + index);

        int index2 = singleElement(arr);
        System.out.println("Single element: " + index2);

    }

    public static int singleElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1)
                mid--;

            if (arr[mid] == arr[mid + 1])
                low = mid + 2;
            else
                high = mid;
        }

        return arr[low];
    }

    public static int bruteForce(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return arr[arr.length - 1];
    }
}
