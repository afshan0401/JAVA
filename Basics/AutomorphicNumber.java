// A number is Automorphic if its square ends with the number itself. We count digits of the number, extract the same number of trailing digits from its square, and compare. 
// ex 25 becomes 625 last 2 digits 25 same. so 25 is automorphic

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 25;
        int sq = n * n;
        int temp = n;
        int digitCount = (n == 0) ? 1 : 0;
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        int power = (int) Math.pow(10, digitCount);

        if (sq % power == n)
            System.out.println("Automorphic");
        else
            System.out.println("not automorphic");


        //MY BRUTE FORCE
        // String sqS = String.valueOf(sqN);
        // int lastDigits =
        // Integer.parseInt(sqS.substring(sqS.length()-digitCount,sqS.length()));
        // // System.out.println(lastDigits+" "+n);
        // if(lastDigits == n) System.out.println("Automorphic number");
        // else System.out.println(" not Automorphic number");

    }
}
