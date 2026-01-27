public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 4, 7, 9 },
                { 12, 13, 16, 18 },
                { 20, 21, 23, 29 } };
        int target = 21;
        System.out.println("Present: " + optimizedBruteApproach(matrix, target));
        System.out.println("Present: " + binaryApproach(matrix, target));
    }

    public static boolean bruteApproach(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int el : row) {
                if (el == target)
                    return true;
            }
        }
        return false;
    }

    public static boolean optimizedBruteApproach(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][(matrix[i].length) - 1]) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return true;
            else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static boolean  binaryApproach(int[][] matrix, int target){
        int totalRows = matrix.length; 
        int totalCols = matrix[0].length; 
        int low = 0;
        int high = totalCols * totalRows -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            int r = mid/totalCols;
            int c = mid%totalCols;
            int midValue = matrix[r][c];
            if(target == midValue) return true;
            else if (target > midValue) low = mid + 1;
            else high = mid -1;
        }

        return false;
    }
}
