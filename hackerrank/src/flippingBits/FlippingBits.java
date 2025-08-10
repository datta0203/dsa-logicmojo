public class FlippingBits {

    static int[] convertToBinary(long n) {
        int[] arr = new int[33];
        for(int i = 0 ; i<arr.length; i++)
           arr[i] = 0;
        long number = n;
        int k = 0;
        while(number > 0) {
            arr[k] = (int) (number %2);
            number = number/2;
            k++;
        }
        for(int i = 0 ; i<k;i++) {
            int temp = arr[i];
            arr[i] = 0;
            arr[32-i] = temp;
        }
        for(int i = 0; i<=32;i++){
            if(arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        return arr;
    }

    static long flippingBits(int[] arr) {
       long result = 0;
       for(int i = 0; i < arr.length; i++) {
        result += arr[i]*((long)Math.pow(2, i));
       }
       return result;
    }

    public static void main(String[] args) {
        long n = 2147483647L;
        int[] arr = convertToBinary(n);
        for(Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println(flippingBits(arr));
    }

}
