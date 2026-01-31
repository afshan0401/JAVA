public class PrimeNumer {
    public static void main(String[] args) {

        int n = 17;
        if (n <= 1){
            System.out.println("not prime");
            return;
        }

        boolean flag = true;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
        if(flag) System.out.println("prime");
        else System.out.println("not prime");
    }
}
