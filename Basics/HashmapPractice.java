import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapPractice {
    public static void main(String[] args) {
        
    }


    public static int migratoryBirds(List<Integer> arr) {
            // find highest freq compare value if more than one return lowest 
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            
            for(int i =0;i<arr.size();i++){
                int n = arr.get(i);
                if(freqMap.containsKey(n)){
                    freqMap.put(n, freqMap.get(n)+ 1);
                } else{
                    freqMap.put(n, 1);
                }
            }
            
            
            //find highest
            int highest = 0;
            for(int val : freqMap.values()){
                if(val > highest) highest = val;
            }
            int result = Integer.MAX_VALUE;
            
            //find lowest no with highest freq
            for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
                if(entry.getValue() == highest && entry.getKey()< result){
                    result = entry.getKey();
                }
            }
    return result;
    }
}
