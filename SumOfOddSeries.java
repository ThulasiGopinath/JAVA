import java.util.Scanner;
public class SumOfOddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long x=0, sum=0;
        for(long i=1;i<=(2*n-1);i=i+2){
            x = x + i;
            sum = sum + (x);
        }
        System.out.println(sum);
    
    }
}

     
    