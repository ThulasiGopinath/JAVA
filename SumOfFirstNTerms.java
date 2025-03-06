import java.util.Scanner;
public class SumOfFirstNTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;  
        for (long i = 1; i <= n; i++) {
            sum = sum + (long) Math.pow(i, 3); // 
        }
        System.out.println(sum);

    }
}