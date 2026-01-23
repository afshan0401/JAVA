public class FibonacciSeries {
    static int a = 0;
    static int b = 1;
    public static void main(String[] args) {
        int n = 10;
        // int c;
        System.out.print(a+" "+b);
        printFibonacci(n-2);
        // for(int i =2;i<n;i++){
        //     c = a + b;
        //     System.out.print(" "+c);
        //     a = b;
        //     b = c;
        }


        public static void printFibonacci(int n){
            int c;
            if(n>0){
                c = a + b;
                a = b;
                b = c;
                System.out.print(" "+c);
                printFibonacci(n-1);

            }

        }
    }


