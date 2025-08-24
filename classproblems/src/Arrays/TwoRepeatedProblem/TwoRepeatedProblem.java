package Arrays.TwoRepeatedProblem;

import java.util.ArrayList;
import java.util.List;

public class TwoRepeatedProblem {

    static void xorApproach(int n, int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

    }

    static void indexApproach(int[] arr) {
        int n = arr.length;
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] > 0)
                arr[index] = -arr[index];
            else if (arr[index] < 0) {
                duplicates.add(index);
            }
        }
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 3, 0, 0};
        indexApproach(arr);

    }
}
