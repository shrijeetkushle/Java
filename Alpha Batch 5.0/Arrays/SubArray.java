public class SubArray {

    // Method to print all subarrays of a given array
    public static void printAllSubArrays(int[] arr) {
        // Iterate over all possible starting points
        for (int start = 0; start < arr.length; start++) {
            // Iterate over all possible ending points
            for (int end = start; end < arr.length; end++) {
                // Print the subarray from start to end
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Main method to test the printAllSubArrays method
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        
        System.out.println("All subarrays of the array:");
        printAllSubArrays(array);
    }
}
