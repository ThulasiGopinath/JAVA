import java.util.Scanner;
public class programset7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the first name");
        String firstname = scan.next();

        System.out.println("Enter the second name");
        String secondname = scan.next();

        String name = firstname.concat(secondname);

        System.out.println("Enter the n");
        int n = scan.nextInt();

        
        for(int i=0;i<n;i=i+1){
            System.out.println(name);
        }

        }
}

