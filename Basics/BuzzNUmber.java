// Buzz number is another special number in Java that ends with digit 7 or divisible by 7.


public class BuzzNUmber {
    public static void main(String[] args) {
        int n = 47;
        if(n%7==0 || n%10 == 7)
            System.out.println("buzz number");
        else
            System.out.println("not buzz");
    }
}
