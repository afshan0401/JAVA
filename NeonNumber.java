// A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
// ex 9, 9 sq 81,  8 +1 = 9 
public class NeonNumber {
    public static void main(String[] args) {
        int num = 9;
        int sq = num * num;
        int sum = 0;
        while(sq!=0){
            sum += sq%10;
            sq /= 10;
        }

        System.out.println(sum==num? "Neon number":" not neon number");
    }
}
