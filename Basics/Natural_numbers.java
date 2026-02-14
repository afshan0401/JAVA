public class Natural_numbers {
    public static void main(String[] args) {
        int n = 5;

        int sum = n *(n+1)/2;
        System.out.println(sum);

        System.out.println(recursiveSum(5));


    }

    public static int recursiveSum(int n){
        if(n==1) return n;

        return n + recursiveSum(n-1);

    }
}
