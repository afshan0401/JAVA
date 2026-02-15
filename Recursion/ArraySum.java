public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        System.out.println(recArraySum(arr, len));
    }

    public static int recArraySum(int[] arr, int n){

        if(n <= 0) return 0;
        
        return arr[n-1] + recArraySum(arr, n-1);
    }
}
