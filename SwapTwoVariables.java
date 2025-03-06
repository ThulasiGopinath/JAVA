import java.util.Scanner;
public class SwapTwoVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your A: ");
        int a = sc.nextInt();
        System.out.println("Enter your B: ");
        int b = sc.nextInt();
    
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("A = " + a);
        System.out.println("B = " + b);         
    }
}