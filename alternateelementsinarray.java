
import java.util.ArrayList;

class alternateelementsinarray {
    // Function to return alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Create an ArrayList to store alternate elements
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]); // Add alternate elements to the list
        }
        return result; // Return the list
    }

    public static void main(String[] args) {
        // Create an object of the current class
        alternateelementsinarray sol = new alternateelementsinarray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Call the getAlternates method
        ArrayList<Integer> result = sol.getAlternates(arr);

        // Print the result
        System.out.println(result); // Prints [1, 3, 5, 7]
    }
}
