// A positive integer is called a spy number if the sum and product of its digits are equal. In other words, a number whose sum and product of all digits are equal is called a spy number.

public class SpyNumber {
    public static void main(String[] args) {
        int num = 1124;
        int sum = 0;
        int prod = 1;

        while (num!=0) {
            int rem = num%10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }

        System.out.println(sum==prod? "spy number":"not spy number");
    }
}
