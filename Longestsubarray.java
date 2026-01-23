public class Longestsubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,4,2,3};
        int K = 3;

        int left = 0; int sum = 0;
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE; // for min subarray
        int start = -1; int end = -1;

        for(int right =0;right<arr.length;right++){
             sum += arr[right];

             while(sum>K){
                sum -= arr[left];
                left++;
             }

             if(sum==K){
                int length = right -left + 1;
                //for max length sub array
                // if(length>maxLength){
                //     maxLength = length;
                //     start = left;
                //     end = right;
                // }

                //for minlength subarray
                if(length<minLength){
                    minLength = length;
                    start = left;
                    end = right;
                }
             }
        }
        if(start!= -1){

            for(int i=start;i<=end;i++){
                System.out.print(arr[i]+" ");
            }
        }
        

    }
}
