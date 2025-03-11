
import java.util.Scanner; // ✅ Import should be at the top

class Solution {
    // Function to compute GCD using Euclidean Algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to compute LCM and return both GCD and LCM in an array
    public int[] lcmAndGcd(int a, int b) {
        int gcdValue = gcd(a, b); // Compute GCD
        int lcmValue = (a * b) / gcdValue; // Compute LCM
        return new int[]{lcmValue, gcdValue}; // Return LCM and GCD as an array
    }
}

public class lcmandgcd {  // ✅ Class name must match the filename (GFG.java)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        Solution obj = new Solution();
        int[] ans = obj.lcmAndGcd(a, b);  // ✅ Correct method call

        System.out.println("LCM: " + ans[0]);
        System.out.println("GCD: " + ans[1]);

        sc.close();
    }
}
