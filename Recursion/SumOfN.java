public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        int sum  = sumOfNumbers(n);
       
        int result  = sumOfNumber(n, 0);
        System.out.println(sum);
        System.out.println(result);

        int sum2 = n * (n +1)/2;
        System.out.println(sum2);

        System.out.println(factorialAgain(5));

    }

    public static int sumOfNumbers(int n){
            if(n==1) return 1;


        return n + sumOfNumbers(n-1);
    }
    public static int sumOfNumber(int n, int sum){
            if(n==0) return sum;


        return sumOfNumber(n-1, sum+n);
    }

    public static int factorialAgain(int n){
        if(n==0 || n ==1 ) return 1;

        return n * factorialAgain(n-1);
    }
}
