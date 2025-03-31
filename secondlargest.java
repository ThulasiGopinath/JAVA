public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {5,7,9,3,9,6,13,2,1};
        
        int large = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }

        int secondlarge = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondlarge && arr[i]!=large){
                secondlarge = arr[i];
            }
        }
        
        System.out.println("The second largest number is " + secondlarge);

    }
}