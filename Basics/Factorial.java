public class Factorial {
    public static void main(String[] args) {
        
        int n = 5;
        if(n==1 || n ==0) {
            System.out.println(1);
            return;
        }
            
        long prod = 1;
        for(int i=n;i>1;i--){
            prod *= i;
        }

        System.out.println(prod);
    }
}
