package Arrays.BitonicPoint;

import javax.swing.*;

public class BitonicPoint {

    static int findBitonic(int[] arr) {
        int n = arr.length;
        int l = 0, r = n - 1;

        if(arr[r] > arr[r-1]) return arr[r];
        if(arr[l] > arr[l+1]) return arr[l];

        while (l <= r) {
            if (arr[l] > arr[l + 1] && arr[r] < arr[r - 1]) break;

            if (arr[l] < arr[l + 1]) l++;
            if (arr[r] < arr[r-1]) r--;

        }

        return arr[r];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8,3,2};
        System.out.println(findBitonic(arr));
    }
}
