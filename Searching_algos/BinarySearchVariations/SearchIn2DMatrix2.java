public class SearchIn2DMatrix2 {
    public static void main(String[] args) {
        // Matrix properties:
        // Each row is sorted left → right
        // Each column is sorted top → bottom
        int[][] matrix = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };
        int target = 16;
        int[] index = optimizedBruteApproach(matrix, target);
        System.out.println("target at index: [" + index[0] + "," + index[1] + "]");
        int[] index1 = binaryApproach(matrix, target);
        System.out.println("target at index: [" + index1[0] + "," + index1[1] + "]");

    }

    public static int[] optimizedBruteApproach(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            int col = binarySearch(matrix[row], target);
            if (col != -1)
                return new int[] { row, col };
        }
        return new int[] { -1, -1 };
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static int[] binaryApproach(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[] { -1, -1 };

        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int currentRow = 0;
        int currentCol = totalCols - 1; // start from top-right

        while (currentRow < totalRows && currentCol >= 0) {
            int value = matrix[currentRow][currentCol];
            if (value == target)
                return new int[] { currentRow, currentCol };
            else if (target > value)
                currentRow++; //move down
            else
                currentCol--; //move left
        }

        return new int[] { -1, -1 };
    }

}
