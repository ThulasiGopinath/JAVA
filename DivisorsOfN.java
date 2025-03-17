public class DivisorsOfN {
    public static void printDivisors(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.print(i + " ");
        }
        printDivisors(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 6; // Change this to any number you want
        System.out.print("Divisors of " + n + ": ");
        printDivisors(n, 1);
    }
}
