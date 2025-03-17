import java.util.Scanner;

class Solution {
    public int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

public class FibonacciusingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        Solution ob = new Solution();
        System.out.println("Fibonacci number at position " + n + " is: " + ob.fib(n)); // Correct method call
    }
}
