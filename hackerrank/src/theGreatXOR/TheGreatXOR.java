package theGreatXOR;

import java.util.*;

public class TheGreatXOR {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long e = sc.nextLong();
            list.add(theGreatXOR(e));
        }

        for (Long l : list) {
            System.out.println(l);
        }
    }

    public static Long theGreatXOR(long e) {
        long count = 0L;
        for (long i = 1L; i < e; i++) {
            long xor = i ^ e;
            if (xor > e) {
                count = count + 1;
            }
        }
        return count;
    }

}
