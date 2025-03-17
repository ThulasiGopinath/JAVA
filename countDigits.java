class countDigits {

    static int countDigits(int n) {  // Renamed method to avoid conflict
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(300403));  // Call the corrected method
    }
}