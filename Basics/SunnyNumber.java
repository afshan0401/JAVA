// A number is called a sunny number if the number next to the given number is a perfect square. In other words, a number N will be a sunny number if N+1 is a perfect square.

public class SunnyNumber {
    public static void main(String[] args) {
        int num = 15;
        int nextNum = num + 1;

        int sqrt = (int) Math.sqrt(nextNum);

        System.out.println(sqrt * sqrt == nextNum ? "Sunny number" : "not Sunny number");
    }
}
