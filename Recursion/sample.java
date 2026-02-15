
import java.util.HashMap;
import java.util.Map;


public class sample {
    public static void main(String[] args) {
      String str = "aabbcde";

      Map<Character, Integer> map1 = new HashMap<>();

      for(char ch: str.toCharArray()){
        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
      }

      System.out.println(map1);

      for(char ch: str.toCharArray()){
        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
      }

    }
}
