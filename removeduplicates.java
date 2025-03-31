import java.util.Arrays;
public class removeduplicates {
    public static void main(String[] args) {

        int[] a = {3,4,4,7,1,3,5,8,4};

        Arrays.sort(a);

        int n = a.length;     
        int j = 0;
        
        for(int i=1;i<n;i++){
            if(a[i] != a[j]){
                j++;
                a[j] = a[i];
            }
        }
        
        a[j] = a[n-1];
        
        System.out.println(Arrays.toString(Arrays.copyOf(a, j + 1)));

    }
}