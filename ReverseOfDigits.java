import java.util.Scanner;
public class ReverseOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long x = n, sum = 0;
        while(n>0){
        sum = sum * 10 + (n%10);
        n = n/10;

        }
        System.out.println(sum);

    }
}