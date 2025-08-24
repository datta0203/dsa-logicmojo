package Arrays.SumPairEqualToX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumPairEqualToX {

    static List<List<Integer>> sumPairEqualToX(int[] arr, int X) {
        Arrays.sort(arr);
        List<List<Integer>> out = new ArrayList<>();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int pairSum = arr[l] + arr[r];
            if (pairSum == X) {
                int finalL = l;
                int finalR = r;
                out.add(new ArrayList<>() {{
                    add(arr[finalL]);
                    add(arr[finalR]);
                }});
                l++;
            } else if (pairSum < X) {
                l++;
            } else if (pairSum > X) {
                r--;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 4, -2, -1, 3, 2, 9};
        List<List<Integer>> out = sumPairEqualToX(arr, 7);

        for (List<Integer> result : out) {
            System.out.print(result.get(0) + " , " + result.get(1));
            System.out.println();
        }
    }
}
