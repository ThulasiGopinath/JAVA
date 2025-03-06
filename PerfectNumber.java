public class PerfectNumber {
    public static void main(String[] args) {

        int n=28, sum=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                sum = sum + i;
                if((n/i)!=i){
                    sum = sum + (n/i);

                }
            }
        }
        if(sum == n){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }

    }
}