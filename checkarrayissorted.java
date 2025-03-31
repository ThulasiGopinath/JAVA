public class checkarrayissorted {
    public static void main(String[] args) {
        int[] arr = {99,56,78,95};
        for(int i=0;i<arr.length-1;i++){
	        if(arr[i]>arr[i+1]){
	            System.out.println("Not sorted");
	        }
	    }
	    System.out.println("Sorted Array");
        

    }
}