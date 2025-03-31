import java.util.Arrays;
public class pushzerostoend {
    public static void main(String[] args) {

        int[] arr = {2,3,0,4,0,1,0,5,0};

        int n=arr.length;
        
        int j=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        
        for(int i=j;i<n;i++){
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }
}