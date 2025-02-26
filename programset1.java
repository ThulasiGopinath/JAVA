import java.util.Scanner;
public class programset1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        String word = scan.next();
        char c = scan.next().charAt(0);

        System.out.println(num);
        System.out.println(word);
        System.out.println(c);



    }
}