
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylistPrac{
    public static void main(String[] args) {
        
        List<List<Integer>> nums = new ArrayList<>();

        nums.add(Arrays.asList(1,2,3));
        nums.add(Arrays.asList(4,5,6));
        nums.add(Arrays.asList(7,8,10));
        int n = nums.size();

       
        int d1 = 0;
        int d2 = 0;
        for(int i=0;i<n;i++){
            d1 += nums.get(i).get(i);
            d2 += nums.get(i).get(n-i-1);
        }

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(Math.abs(d1-d2));




    }
}
