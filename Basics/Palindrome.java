public class Palindrome {
    public static void main(String[] args) {
        //PALINDROME - reads same backwards as well as forwards

        int n = 1234321;
        if(n<0){
            System.out.println("not palindrome");
            return;
        }
        int temp = n;
        int rev = 0;
        int rem;

        while(n!=0){
            rem = n % 10;
            n = n/10;
            rev = rev * 10 + rem;

        }
        
        System.out.println(rev==temp ? "palindrome" : "not palindrome");

    }
}
