import java.util.Scanner;

public class CountZero {
    public static int countZero(int n) {
        // Base case: If the number is a single digit
        if (n % 10 == n) {
            System.out.println(n); // Print the number for debugging
            return (n == 0) ? 1 : 0; // If the digit is 0, return 1; otherwise, return 0
        }

        System.out.println(n); // Print the number for debugging

        // Recursive case: If the last digit is 0, add 1 and recurse
        if (n % 10 == 0) {
            return 1 + countZero(n / 10);
        } else {
            return countZero(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // Close scanner to prevent resource leaks

        System.out.println("Number of zeros: " + countZero(num));
    }
}
