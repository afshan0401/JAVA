
public class DuckNumber {
    public static void main(String[] args) {
        int n = 041;

        String num = String.valueOf(n);

        if (num.charAt(0) == '0') {
            System.out.println("not duck number");
        }

        System.out.println(num.contains("0") ? "duck number" : "not duck number");
    }
}
