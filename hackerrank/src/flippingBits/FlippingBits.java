package flippingBits;

public class FlippingBits {

    static int[] convertToBinary(long n) {
        int[] arr = new int[32];
        long number = n;
        int k = 0;
        while (number > 0) {
            arr[31-k] = (int) (number % 2);
            number = number / 2;
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    static long flippingBits(long n) {
        long result = 0L;
        int[] arr = convertToBinary(n);
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        long n = 2147483647L;


        //System.out.println(convertToBinary(4L));
        System.out.println(flippingBits(n));
    }

}
