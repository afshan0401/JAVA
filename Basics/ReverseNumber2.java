public class ReverseNumber2 {
    public static void main(String[] args) {
        
        int n = 2345;
        int result = reverseNumber(n);
        System.out.println(result);
    }

    public static int reverseNumber(int n ){
        int reverseNo = 0;
        int rem = 0;

        while(n!=0){
            rem = n%10;
            reverseNo = reverseNo * 10 + rem;
            n /= 10;
        }

        return reverseNo;
    }
}
