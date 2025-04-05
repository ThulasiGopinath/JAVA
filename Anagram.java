public class Anagram {
    public static void main(String[] args) {

        String s1 = "loop", s2 = "pool";
         // If lengths are different, not anagrams
        if (s1.length() != s2.length()) System.out.println("Not an anagram");

        int[] freq = new int[258]; // Correct way to declare array in Java

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;   // Use charAt() to access characters
        }

        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < 258; i++) {
            if (freq[i] != 0) {
                System.out.println("Not an Anagram");
            }
        }

        System.out.println("Anagram");

    }
}