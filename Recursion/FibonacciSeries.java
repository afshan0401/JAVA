public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fibonacci Series: ");
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < num; i++) {
            int n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

        System.out.println("Fibonacci Series(Recursive): ");
        fibonacciRecursive(num, 0, 1);
        System.out.println();
        System.out.println("Sum: " + fibonacciSum(num));
    }

    public static void fibonacciRecursive(int num, int a, int b) {
        if (num == 0)
            return;

        System.out.print(a + " ");

        // a = b and b = a + b
        fibonacciRecursive(num - 1, b, a + b);
    }

    public static int fibonacciSum(int n) {
        if (n <= 1)
            return 1;

        return fibonacciSum(n - 1) + fibonacciSum(n - 2);
    }

    public static int fibonacciSum(int n, int a, int b, int sum) {
        if (n == 0)
            return sum;

        return fibonacciSum(n - 1, b, a + b, sum + a);
    }
}
