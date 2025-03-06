class KthDigitWithPower {
    public static long findKthDigit(int A, int B, int k) {
        long power = (long) Math.pow(A, B);
        long i = 1;

        while (power > 0) {
            long ans = power % 10;
            if (k == i) {
                return ans;
            }
            i++;
            power = power / 10;
        }
        return 0;
    }

    public static void main(String[] args) {
        int A = 3, B = 3, k = 1;
        System.out.println(findKthDigit(A, B, k)); 
    }
}
