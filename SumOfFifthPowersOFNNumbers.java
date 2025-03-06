import java.util.Scanner;
public class SumOfFifthPowersOFNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long sum=0;
        for(long i = 1; i <= N; i++){  
            sum = sum + (long) Math.pow(i,5);
        }
        System.out.println(sum);

    }
}