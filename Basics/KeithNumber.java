
public class KeithNumber {
    public static void main(String[] args) {
        int num = 197;
        int temp = num;

        int count = 0;
        while (temp != 0) {

            count++;
            temp /= 10;
        }
        temp = num;
        // count done
        // 1st sum done
        int[] digitsArray = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digitsArray[i] = temp % 10;
            temp /= 10;
        }
        // array {1,9,7}

        while (true) {

            int sum = 0;

            for (int n : digitsArray)
                sum += n;
            if (sum == num) {
                System.out.println("keith number");
                return;
            }
            if (sum > num) {
                System.out.println(" not keith number");
                return;
            }

            // shift
            for (int i = 0; i < count - 1; i++) {
                digitsArray[i] = digitsArray[i + 1];
            }

            digitsArray[count - 1] = sum;
        }

    }
}
