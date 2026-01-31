
import java.util.ArrayList;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n = 30;
        ArrayList<Integer> factors = new ArrayList<>();

        if(n%2==0){
            factors.add(2);
            n/=2;
        }

        for(int i=3; i*i<=n; i++){
            if(n%i==0){
                factors.add(i);
                n/=i;
            }
        }

        if(n>1){
            factors.add(n);
        }
        System.out.println(factors);

    }
}
