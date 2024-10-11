import java.util.HashMap;
import java.util.Map;

public class ArrayPairs {

    // Method to find and print pairs with a given sum
    public static void findPairs(int[] arr, int targetSum) {
        // Create a map to store elements and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement of the current element
            int complement = targetSum - arr[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Print the pair
                System.out.println("Pair found: (" + arr[i] + ", " + complement + ")");
            }

            // Add the current element to the map
            map.put(arr[i], i);
        }
    }

    // Main method to test the findPairs method
    public static void main(String[] args) {
        int[] array = {1, 5, 7, -1, 5};
        int targetSum = 6;
        
        System.out.println("Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nPairs with sum " + targetSum + ":");
        findPairs(array, targetSum);
    }
}
