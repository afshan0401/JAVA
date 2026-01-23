public class reversePyramid {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*n-1)-2*i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
