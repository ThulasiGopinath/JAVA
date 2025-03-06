public class countingdigits {
    public static void main(String[] args) {
        int n=325345, count=0;
        while(n>0){
            int ld=n%10;
            count=count+1;
            n=n/10;
        }
        System.out.println(count);

    }
}