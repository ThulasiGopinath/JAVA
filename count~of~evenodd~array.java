import java.util.Scanner;
public class count~of~evenodd~array {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int n=0, even=0, odd=0;
        
        System.out.println("Enter the size of the array: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int[] arr = new int[n];

        System.out.println(
            "Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println(
            "The number of odd and even digits are: ");
        
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even = even++;
            }else{
                odd = odd++;
            }
        }
        System.out.println("Even = " +even);
        System.out.println("Odd = " +odd);

    }
}