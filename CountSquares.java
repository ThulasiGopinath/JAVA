import java.util.Scanner;
public class CountSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i * i < n; i++) { // Only iterate up to sqrt(N)
            count++;
        }
        System.out.println(count);

    }
}