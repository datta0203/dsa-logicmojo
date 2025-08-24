package Arrays.Separate0from1;

public class Separate0From1 {

    static void swap(int[] arr, int i, int j) {
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    static void twoPointerApproach(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && arr[l] == 0) {
                l++;
            }
            while (l < r && arr[r] == 1) { // to prevent out-of-bounds if all are 0 or 1.
                r--;
            }
            // swap arr l and r when both have stopped.
            // swap
            swap(arr, l++, r--);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1,0};
        twoPointerApproach(arr);

        for (int num : arr)
            System.out.print(num + " ");

    }
}
