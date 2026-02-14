public class NUmberToWord {

    public static void main(String[] args) {

        int num = 1004000;
        int rev = 0;
        int digit;

        String[] wordArray = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (num == 0) {
            System.out.println(wordArray[0]);
            return;
        }
        int temp = num;
        // reverse number
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println("Reversed: " + rev);
        // convert digits into word
        temp = num; // controls how many digits to process
        // coz reversing loses zeros but temp keeps the count
        while (temp != 0) {
            digit = rev % 10;
            System.out.print(wordArray[digit] + " ");
            rev /= 10;
            temp /= 10;
        }

    }
}
