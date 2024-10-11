public class ReverseArray {

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap the elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    // Main method to test the reverseArray method
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        // Reverse the array
        reverseArray(array);
        
        System.out.println("\nReversed array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

