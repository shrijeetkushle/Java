public class MaxSubArray {

    // Method to find the maximum sum subarray
    public static int maxSubArray(int[] nums) {
        // Initialize variables to store the maximum sum and the current sum
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Main method to test the maxSubArray method
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = maxSubArray(array);

        System.out.println("Maximum sum of subarray: " + maxSum);
    }
}
