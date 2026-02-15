public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 7, 2, 5, 4, 5 };

        System.out.println(recSortCheck(arr, arr.length));
        System.out.println(recSortCheck(arr1, arr1.length));
    }

    public static boolean recSortCheck(int[] arr, int n) {
        if (n == 0 || n == 1)
            return true;

        if (arr[n - 1] < arr[n - 2])
            return false;

        return recSortCheck(arr, n - 1);

    }
}
