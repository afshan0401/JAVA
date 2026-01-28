import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            // start j from i + 1 coz in first iteration it basically compares
            // arr[j] < arr[minIndex] or arr[j= i] < arr[i] or arr[i] < arr[i] so always
            // false
            // useless operation
            for (int j = i + 1; j < arr.length; j++) {
                // in the unsorted part which el is least its index is set in minIndex after
                // full iteration over array
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            // swap arr[i] the sorted part to be with the min el in the unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}