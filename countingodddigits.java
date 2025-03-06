class countingodddigits {
    public static void main(String[] args) {
       int n=54637, count=0;
       while(n>0){
          int ld=n%10;
          if(ld%2==0){
             count = count + 1;
          }
          n=n/10;
       }
       System.out.println(count);
    }
}