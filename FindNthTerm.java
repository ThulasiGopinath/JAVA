//Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…
//Input: n = 4 
//Output: 10
//Explanation: The 4th term of the Series is 10.

import java.util.Scanner;
public class FindNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}

