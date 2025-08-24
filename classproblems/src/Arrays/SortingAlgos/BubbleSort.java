package Arrays.SortingAlgos;

public class BubbleSort {

    static void swap(int[] arr, int i, int j) {
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    static void bubble(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // int[] arr = {5, 2, 1, 9, 3};
        int[] arr = {1, 2, 3, 5, 9};
        bubble(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }

}
