public class ArmstrongNumber {
    public static void main(String[] args) {
        // Example 1: 153 (classic)
        // Number of digits = 3
        // 1³ + 5³ + 3³= 1 + 125 + 27= 153
        int n = 153;
        int result = armstrong(153);

        if(n == result) System.out.println("armstrong");
        else System.out.println("not armstrong");
        
    }

    public static int armstrong(int n){
        if(n ==0) return 0;
        int sum = 0;
        int temp = n;
        int digitCount = 0;
        int rem;
        while(temp!=0){
            temp/=10;
            digitCount++;
        }
        if(digitCount == 1) return n;
        while(n!=0){
            rem = n % 10;
            sum = sum + (int)Math.pow(rem, digitCount); 
            n = n/10;
        }

        return sum;
    }
}
