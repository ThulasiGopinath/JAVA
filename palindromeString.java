public class palindromeString {
    public static void main(String[] args) {
        String str = "Malayala";
        str = str.toLowerCase(); // To ignore case
        int i = 0, j = str.length() - 1;
        char[] arr = str.toCharArray();
        boolean isPalindrome = true;

        while (i < j) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}