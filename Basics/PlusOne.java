import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = { 9,9,9 };

        System.out.println(Arrays.toString(plusOneSol(num)));
    }

    public static int[] plusOneSol(int[] arr) {
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            } 
            arr[i] = 0; 

        }
         // if we reach here, all digits were 9
        int[] newArr = new int[arr.length+1];
        newArr[0] = 1; //rest are by default 0;
        return newArr;
    }
}
