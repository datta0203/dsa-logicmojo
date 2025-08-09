package maximizeXOR;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximizeXOR {

    static int maximizeXOR(int l, int r) {
        Map<String, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                String keyForward = i + "-" + j;
                String keyReverse = j + "-" + i;
                if (!map.containsKey(keyForward) && !map.containsKey(keyReverse)) {
                    int xorValue = i ^ j;
                    if (max < xorValue) max = xorValue;
                    map.put(keyForward, xorValue);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(maximizeXOR(l, r));

    }

}
