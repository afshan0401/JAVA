public class StringcharRemoval {
    public static void main(String[] args) {

        String str = "@*&@UTvy78  as#ertD$ @";
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = str.length() - 1;
        while (left != right) {
            if (!(str.charAt(left) == str.charAt(right))) {
                System.out.println("No");
                break;
            } else {
                left++;
                right--;
            }
        }

        System.out.println("Yes");
    }
}