public class ReverseNumber2 {
    public static void main(String[] args) {
        
        int n = 2345;
        int result = reverseNumber(n);
        System.out.println(result);
    }

    public static int reverseNumber(int n ){
        int rev = 0;
        int rem;

        while (n!=0) {
            rem = n%10;
            rev = rev * 10 + rem;
            n /= 10;
        }


        return rev;
    }
}
