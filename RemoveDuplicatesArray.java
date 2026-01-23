import java.util.Arrays;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4,5};
        
        // 'left' marks where to place the next unique element
        int left = 1; // index 0 is always unique, start from 1
        
        // 'right' scans through array looking for unique values
        for(int right = 1; right < arr.length; right++){
            
            // Compare current element with last unique element start from index 0  or [left - 1]
            if(arr[right] != arr[left-1]){
                
                arr[left] = arr[right];  // Found unique, place it at 'left'
                left++;                   // Move 'left' forward
            }
            // If duplicate, just move 'right' forward (do nothing)
        }
        
        System.out.println(left);  
        System.out.println(Arrays.toString(arr));  // First 'left' elements are unique
    }
}