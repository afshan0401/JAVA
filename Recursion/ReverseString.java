public class ReverseString {
    public static void main(String[] args) {
        String str = "Afshan";

        char[] stringChar = str.toCharArray();

        String rev = reverseStringRec(stringChar, 0, stringChar.length - 1);
        System.out.println(rev);

        String rev1 = reverseStringRecursive(str);
        System.out.println(rev1);

        // System.out.println(str.substring(1) + str.charAt(0));
    }

    // using charArray
    public static String reverseStringRec(char[] str, int left, int right) {
        if (left > right)
            return new String(str);

        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
        return reverseStringRec(str, left + 1, right - 1);

    }

    public static String reverseStringRecursive(String str) {
        if (str.length() <= 1)
            return str;

        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

}
