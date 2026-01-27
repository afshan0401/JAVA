

public class DuckNumber {
    public static void main(String[] args) {
        // int n = 3405;
        int n = 03405;

        String s = String.valueOf(n);

        if(s.charAt(0)!=('0') && s.contains("0")){
            System.out.println("Duck number");
        }else
            System.out.println("not duck");
    }
}
