import java.util.*;

public class sieveoferatosthenes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the start range: ");
        int left = sc.nextInt();

        System.out.println("Enter the end range: ");
        int Right = sc.nextInt();

        int a[] = new int[Right + 1];  // Corrected array size
        Arrays.fill(a, 1);  // Assume all numbers are prime

        for (int i = 2; i <= Math.sqrt(Right); i++) {
            if (a[i] == 1) {
                for (int j = i * 2; j <= Right; j += i) {
                    a[j] = 0; // Mark multiples as non-prime
                }
            }
        }

        System.out.println("The Prime Numbers Between " + left + " and " + Right + " are:");
        for (int i = left; i <= Right; i++) {
            if (a[i] == 1 && i > 1) {  // Exclude 1 as it's not prime
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}