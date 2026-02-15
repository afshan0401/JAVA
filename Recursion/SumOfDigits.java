public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumOfDigitsRec(n));
    }

    public static int sumOfDigitsRec(int n){
        if(n==0) return 0;

        return (n%10) + sumOfDigitsRec(n/10);
    }
}
