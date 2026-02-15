

public class GCD {
    //using Euclidean Algorithm.
    //GCD(a,b) = GCD(b, b%a) until remainder is 0
    public static void main(String[] args) {
        int a = 8, b = 12;

        while(b!=0){
            int temp = b;
            b = b%a;
            a = temp;
        }
        System.out.println(a);

        System.out.println(recGCD(a,b));

    }

    public static int recGCD(int a, int b){
            if(b==0) return a;

            return recGCD(b, b%a);
    }
}
