public class findelementinarray {
    public static void main(String[] args) {
        // Your Code goes here!
        int[] arr = {32,45,789,654,56,444,90};

        int n=7, flag= -1, x=789;

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag = i;
            }
        }
        System.out.println(flag);
        
        if(flag==-1){              
                System.out.println("Element not present");
            }
    }
}