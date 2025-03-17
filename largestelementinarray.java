public class largestelementinarray {
    public static void main(String[] args) {
        int n=6;
        int[] a={32,78,94,56,78,95};
        int large=a[0];
        for(int i=0;i<n;i++){
            if(large<a[i]){
                large=a[i];
            }
        }
        System.out.println(large);

    }
}