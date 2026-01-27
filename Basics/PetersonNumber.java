// A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.

public class PetersonNumber {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int rem;
        int factorialSum = 0;

        while (temp != 0) {
            rem = temp % 10;
            factorialSum += factorial(rem);
            temp /= 10;
        }

        System.out.println((factorialSum == num)? "Peterson": "not peterson");
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return factorial(n-1) * n;
    }
}
