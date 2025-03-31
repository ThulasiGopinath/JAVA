public class thirdlargest {
    public static void main(String[] args) {

        int[] arr = {5,7,9,3,6,13,2,1};

        int lar1=-1;
        int lar2=-1;
        int lar3=-1;
        
        if(arr.length<3){
            System.out.println("-1");
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar1)
            {
                lar3=lar2;
                lar2=lar1;
                lar1=arr[i];
            }
            else if(arr[i]>=lar2 && arr[i]<=lar1)
            {
                lar3=lar2;
                lar2=arr[i];
            }
            else if(arr[i]>=lar3 && arr[i]<=lar2)
            {
                lar3=arr[i];
            }
        }
        System.out.println("The third largest number is " + lar3);

    }
}