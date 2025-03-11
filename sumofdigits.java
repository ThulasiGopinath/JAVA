import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n % 10; // Extract the last digit and add it to sum
            n /= 10; // Remove the last digit
        }

        System.out.println(sum);
        sc.close();
    }
}