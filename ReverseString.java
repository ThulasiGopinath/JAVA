public class ReverseString {
    public static void main(String[] args) {
    String str = "thulasi";
    int i = 0, j = str.length() - 1;
    char[] arr = str.toCharArray(); // Convert string to character array
    while (i <= j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        i++;
        j--;
    }
    System.out.println("Reverse of the given String is : ");
    System.out.println(arr);

    }
}