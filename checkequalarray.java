import java.util.Arrays;

public class checkequalarray {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};

         if(a.length!=b.length){
            System.out.println("Not equal");
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
	        if(a[i]!=b[i]){
	            System.out.println("Not equal");
	        }
	    }
	    System.out.println("Arrays are equal");

    }
}