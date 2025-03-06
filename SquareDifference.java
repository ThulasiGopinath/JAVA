import java.util.Scanner;
public class SquareDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long sum1 = 0, sum2 = 0, res = 0, n = 0;

        for (int i = 1; i <= N; i++) {
            n = n + i; 
            sum1 = sum1 + (long) Math.pow(i, 2); 
        }

        sum2 = (long) Math.pow(n, 2); 
        res = sum2 - sum1; 

        System.out.println(res);

    }
}