
import java.security.SecureRandom;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        // int num = (int)(Math.random() * (max - min + 1)) + min;

        int min = 100;
        int max = 400;
        int random = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(random);
        // 1 to 10 as upper limit is exclusive we add + 1
        int ran = (int) (Math.random() * 10) + 1;
        System.out.println(ran);

        //USING RANDOM CLASS
        Random r = new Random();

        int n = r.nextInt(100)+1;
        System.out.println(n);

        int num = r.nextInt(max - min + 1) + min;
        System.out.println(num);

        //GENERATE 6 DIGIT OTP
        int minOtp = 100000;
        int maxOtp = 999999;
        int otp = r.nextInt(maxOtp-minOtp+1) + minOtp;
        System.out.println("OTP generated :" + otp);


        //Secure Random

        SecureRandom sr = new SecureRandom();
        int secureOtp = sr.nextInt(maxOtp-minOtp + 1) + minOtp;
        System.out.println("Secure OTP: "+secureOtp);

        

    }
}
