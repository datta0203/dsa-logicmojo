package theGreatXOR;

import java.util.*;

public class TheGreatXOR {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long e = sc.nextLong();
            list.add(theGreatXor(e));
        }

        for (Long l : list) {
            System.out.println(l);
        }
    }

    static long findClosestPowerOfTwo(long e) {
        long res = 1L;
        for(long i = 1L; i < 8*Long.BYTES;i++) {
            long curr = 1L << i;
            if(curr > e) break;
            res = curr;
        }
        return res;
    }

    public static Long theGreatXor(long n) {
        long nextPow2 = 1L << (64 - Long.numberOfLeadingZeros(n));
       return nextPow2 - n -1;

    }

}
