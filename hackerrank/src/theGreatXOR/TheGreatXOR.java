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

    static long findClosestPowerOfTwo(long e) {
        long res = 1L;
        for(long i = 1L; i < 8*Long.BYTES;i++) {
            long curr = 1 << i;
            if(curr > e) break;
            res = curr;
        }
        return res;
    }

    public static Long theGreatXOR(long e) {
        long count = 0L;
        long limit =  findClosestPowerOfTwo(e);
        for (long i = 1L; i < limit; i++) {
            long xor = i ^ e;
            if (xor > e) {
                count = count + 1;
            }
        }
        return count;
    }

}
