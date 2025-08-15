package missingNumbers;

import java.util.*;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < brr.size(); i++) {
            if (map.containsKey(brr.get(i))) {
                int old = map.get(brr.get(i));
                map.replace(brr.get(i), old + 1);
            } else {
                map.put(brr.get(i), 1);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            int old = map.get(arr.get(i));
            map.replace(arr.get(i), old - 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) != 0)
                result.add(key);
        }

       Collections.sort(result);
       return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>() {{
            add(203);
        }};
        List<Integer> brr = new ArrayList<>() {{
            add(203);
        }};
        List<Integer> result = missingNumbers(arr, brr);
        for (Integer num : result) {
            System.out.print(num + " ");
        }
    }

}
