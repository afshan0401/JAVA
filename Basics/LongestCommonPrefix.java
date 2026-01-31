
public class LongestCommonPrefix {
    public static void main(String[] args) {

        // return longest common string in all the elements of the array
        String[] str = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefixSol(str));
    }

    public static String longestCommonPrefixSol(String[] str) {
        String first = str[0];

        for (int i = 0; i < first.length(); i++) {

            char c = first.charAt(i);

            for (int j = 1; j < str.length; j++) {
                //only matching the index of the first with same indices of other strings
                if (i >= str[j].length() || c != str[j].charAt(i)) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
