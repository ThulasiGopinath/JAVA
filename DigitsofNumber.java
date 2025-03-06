class DigitsofNumber {
    public static void main(String[] args) {
       int n=34534543;
       while(n>0){
          int ld=n%10;
          System.out.println(ld);
          n=n/10;
       }
    }
}