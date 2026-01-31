
import java.util.HashMap;



public class subarraySumPrefixMashMap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
    int K = 3;
    int currentSum = 0;
    int validSubarray = 0;

    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);

    for(int n: arr){
        currentSum += n;
            // check if has currentSum - K occuring prefix sum before if yes add value to result 
        if(map.containsKey(currentSum - K)){
            validSubarray += map.get(currentSum -K);
        }

        // store current sum in map too
        map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
    }
    System.out.println(validSubarray);

    }


}
