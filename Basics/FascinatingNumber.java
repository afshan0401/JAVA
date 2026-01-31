// Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
// n   = 192 2n  = 384 3n  = 576 so n + 2n + 3n = 192384576

public class FascinatingNumber {
    public static void main(String[] args) {
        int n = 192;
        String s = "" +n +n*2 + n*3 ;
        if(s.length() != 9) {
            System.out.println("not fascinating number");
            return;
        }
        
        int[] freq = new int[10]; // all 0
        
        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i) - '0';
            if(digit ==0){
                System.out.println("not fascinating number");
                return;
            }
            //increase freq of digit
            freq[digit]++;
        }
        for(int i=1;i<=9;i++){
            if(freq[i]!=1){
                System.out.println("not fascinating number");
                return;

            }
        }

        System.out.println("fascinating number");



    }
}
