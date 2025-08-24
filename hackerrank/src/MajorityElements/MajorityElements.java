package MajorityElements;

import java.util.ArrayList;
import java.util.List;

public class MajorityElements {


    static int majorityElement(int n, List<Integer> arr) {

        int candidate = 0, votes = 0;
        for (int i = 0; i < n; i++) {
            if (votes == 0) {
                candidate = arr.get(i);
                votes++;
            } else {
                if (candidate == arr.get(i)) {
                    votes++;
                } else {
                    votes--;
                }
            }
        }
        votes = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == candidate) {
                votes++;
            }
        }
        if (votes > n / 2) return candidate;
        return -1;
    }


    public static void main(String[] args) {
        int N = 5;
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println(majorityElement(N, list));
    }

}
