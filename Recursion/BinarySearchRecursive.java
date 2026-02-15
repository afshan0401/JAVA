public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 61, 2 };
        int target = 61;
        System.out.println(recBinarySearch(arr, 0, arr.length-1,target));
    }

    public static int recBinarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }else if (arr[mid]< target) {
            
            return recBinarySearch(arr, mid + 1, high, target);
        }
        else {
            return recBinarySearch(arr, low, mid - 1, target);
        }
    }

    }
