import java.util.Scanner;
class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0, count=0;
        for(int i=1;i<=n;i++){
          if(n%i==0 && i%3==0){
              flag=1;
              count++;
              
          }
        }
        System.out.println(count);
    }
}