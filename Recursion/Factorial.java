
public class Factorial {
    public static void main(String[] args) {
        Factorial t1 = new Factorial();

        long n = 5;
        long prod = 1;
        for (int i = 2; i <= n; i++) {
            prod *= i;
        }
        System.out.println(prod);

        //using factorial
        long ans = t1.recurFactorial(n);
        System.out.println(ans);

        
    }
    
    public long recurFactorial(long n){
        if(n<0){
            throw new IllegalArgumentException("Invalid input");
        }
        if (n==0 || n ==1 ) return 1;

        return n * recurFactorial(n-1);
    }
}
