// A number is called an emirp number if we get another prime number on reversing the number itself. In other words, an emirp number is a number that is prime forwards or backward. It is also known as twisted prime numbers.

import java.util.UUID;

public class EmirpNumber {
    public static void main(String[] args) {

        int num = 199;
        if (num <= 1) {
            System.out.println("not prime so not emirp");
            return;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("entered number isn't prime. So not emirp");
                return;
            }
        }

        int rev = 0;
        int temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        for (int i = 2; i * i <= rev; i++) {
            if (rev % i == 0) {
                System.out.println("not emirp");
                return;
            }
        }

        System.out.println("emirp number");
        System.out.println(UUID.randomUUID().toString().substring(0,8).toUpperCase());
    }
}
