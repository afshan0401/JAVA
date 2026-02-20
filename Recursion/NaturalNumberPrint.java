public class NaturalNumberPrint {
    public static void main(String[] args) {
        naturalNumberReverse(10);
        System.out.println();
        naturalNumber(10);
    }

    public static void naturalNumberReverse(int n){
        if(n == 0) return;

        System.out.print(n + " ");
        naturalNumberReverse(n-1);
    }
    public static void naturalNumber(int n){
        if(n == 0) return;
        
        naturalNumber(n-1);
        System.out.print(n + " ");
    }
}
