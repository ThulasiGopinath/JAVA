class PrimeNumbers{
    public static void main(String[] args) {
        int n=10, flag=1;
        for(int i=2;i<=n;i++){
            if(i%i==0){
                flag=0;
                System.out.print(i + " ");
            }
        }
    }
}