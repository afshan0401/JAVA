
import java.util.ArrayList;

// Sphenic Number
// A positive integer n is called a sphenic number if the product of factors of the given number (n) is exactly three and all factors are prime. In other words, if n is a sphenic integer then n=p x q x r (p, q, and are three distinct prime numbers and their product are n). It is a sequence A007304 in the OEIS. Let's understand it through an example.

public class SphenicNumber {
    public static void main(String[] args) {
        ArrayList<Integer> factors = new ArrayList<>();
        int number = 110;

        SphenicNumber sn = new SphenicNumber();
        sn.SphenicCheck(number);
        // int n = number;
        // while (n % 2 == 0) {
        //     factors.add(2);
        //     n /= 2;
        // }

        // // after this n is odd
        // // so hopping i+2
        // for (int i = 3; i * i <= n; i += 2) {
        //     while (n % i == 0) {
        //         factors.add(i);
        //         n /= i;
        //     }

        // }

        // if (n > 1)
        //     factors.add(n);

        // HashSet<Integer> unique = new HashSet<>(factors);

        // if (factors.size() == 3 && unique.size() == 3) {
        //     System.out.println("sphenic");
        // } else {
        //     System.out.println("not sphenic");
        // }

    }

    public void SphenicCheck(int number) {

        //no hashset no arraylist early exits 
        
        int n = number;

        int count = 0;

        // factor 2
        if (n % 2 == 0) {
            count++;
            n /= 2;
            if (n % 2 == 0) {  //if 2 appears again stop 
                System.out.println("not sphenic");
                return;
            }
        }

        // odd factors
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                count++;
                n /= i;

                if (n % i == 0 || count > 3) { //if any odd prime appears again stop
                    System.out.println("not sphenic");
                    return;
                }
            }
        }

        // leftover prime
        if (n > 1)
            count++;

        System.out.println(count == 3 ? "sphenic" : "not sphenic");

    }
}
