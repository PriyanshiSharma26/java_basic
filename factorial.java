public class factorial {
    
        public static void main(String[] args) {
            int number = 5; // You can change this value to test other numbers
    
            // Validate the number
            if (number < 0) {
                System.out.println("Number must be non-negative.");
                return;
            }
    
            // Calculate factorial
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
    
            // Print the result
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
    
    
