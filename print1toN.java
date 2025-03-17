import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        // Your Code goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        printNos(n);
    }

    public static void printNos(int n) {
        // Your code here
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n + " ");
    }
}

