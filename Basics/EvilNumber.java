// The Evil number is another special positive whole number in Java that has an even number of 1's in its binary equivalent.

public class EvilNumber {
    public static void main(String[] args) {
        // int n = 16;
        int n = 15;
        int temp = n;
        String binary = "";
        while(temp>0){
            binary += (temp%2);
            temp/=2;
        }

        int count = 0;
        for(char ch:binary.toCharArray()){
            if(ch == '1') count++;
        }
        System.out.println(binary);
        if(count%2==0){
            System.out.println("evil number");
        }else{
            System.out.println("no evil");
        }




    }
}
