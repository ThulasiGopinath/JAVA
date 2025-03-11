import java.util.Scanner;

public class NumberofPrimeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}