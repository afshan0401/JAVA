public class dsaprac {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int k = 2;
        k = k % a.length;
        int j = 0;

        while (j < k) {
            int firstEl = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length-1] = firstEl;
            j++;
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
