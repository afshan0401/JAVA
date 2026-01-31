public class ISBNNumber {

    public static void main(String[] args) {
        int n = 1259060977;
        String s = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int digit = s.charAt(i) - '0';
            sum += digit * (i + 1);
        }

        if (sum % 11 == 0)
            System.out.println("ISBN Number");
        else
            System.out.println("not ISBN Number");
    }
}
