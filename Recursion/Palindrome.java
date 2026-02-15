public class Palindrome {
    public static void main(String[] args) {
        String str = "radara";
        boolean flag = palindromeRecursive(str, 0, str.length() - 1);
        boolean flag2 = palindromeRecursive(str, 0);

        System.out.println(flag ? "Palindrome" : "not palindrome");
        System.out.println(flag2 ? "Palindrome" : "not palindrome");

    }

    public static boolean palindromeRecursive(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return palindromeRecursive(str, left + 1, right - 1);
    }


    
    public static boolean palindromeRecursive(String str, int left) {
        if (left >= str.length()/2)
            return true;

        if (str.charAt(left) != str.charAt(str.length()-left-1))
            return false;

        return palindromeRecursive(str, left + 1);
    }
}
