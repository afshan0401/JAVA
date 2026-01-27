public class NumberTOWordUsingString {
    public static void main(String[] args) {

        int num = 10040;
        String numS = String.valueOf(num);
        StringBuilder br = new StringBuilder();
        int digit;
        String[] word = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for (int i = 0; i < numS.length(); i++) {
            char ch = numS.charAt(i);
            digit = ch - '0';
            br.append(word[digit]+" ");
            
        }

        System.out.println(br);

    }
}
