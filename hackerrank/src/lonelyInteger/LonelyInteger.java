package lonelyInteger;

import java.util.*;

public class LonelyInteger {

    static int lonelyIntegerUsingXOR(List<Integer> a) {
        int unique = 0;
        for(Integer element : a) {
            unique ^= element;
        }
        return unique;
    }

    static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : a) {
            if (map.containsKey(element)) {
                int curr = map.get(element);
                map.replace(element, curr + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) return key;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(sc.nextInt());

        System.out.println(lonelyInteger(list));
    }
}
