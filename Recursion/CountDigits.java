public class CountDigits {
    public static void main(String[] args) {
        int n = 4536;
        System.out.println(recCountDigits(n));
    }

    public static int recCountDigits(int n){
        if(n==0) return 0;

        return 1 + recCountDigits(n/10);
    }
}
