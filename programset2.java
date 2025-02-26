import java.util.Scanner;
public class programset2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the first angle : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second angle : ");
        int num2 = scan.nextInt();
        System.out.println("Enter the third angle : ");
        int num3 = scan.nextInt();

        int num = num1 + num2 + num3;

        if(num==180){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot be formed");
        }


    }
}