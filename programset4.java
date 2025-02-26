import java.util.Scanner;
public class programset4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the size : ");
        int size = scan.nextInt();

        switch(size){
            case 29:
            System.out.println("SMALL");
            break;
            case 30:
            System.out.println("MEDIUM");
            break;
            case 38:
            System.out.println("LARGE");
            break;
            case 42:
            System.out.println("XLARGE");
            break;
            default:
            System.out.println("Invalid");
            break;
        }

        }

    }
