public class FactorialCalculator {

    // Method to calculate the factorial of a number iteratively
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to test the factorialIterative method
    public static void main(String[] args) {
        int number = 5;
        
        int result = factorialIterative(number);
        
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
