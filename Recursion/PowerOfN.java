public class PowerOfN {
    public static void main(String[] args) {
        int n = 4;
        int pow = 3;

        System.out.println(powerN(n,pow));
    }

    public static int powerN(int n, int pow){
        if(pow==0) return 1;

        return n * powerN(n, pow-1);
    }
}
