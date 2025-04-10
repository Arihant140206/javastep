import java.util.Scanner;  // Import the Scanner class for user input

class Swappingnumbers {  // Class name should follow Java naming conventions (PascalCase)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object for user input
        
        // Prompt the user to enter the first number
        System.out.println("Enter 1st number: ");
        double num1 = input.nextDouble();  // Read the first number from the user
        
        // Prompt the user to enter the second number
        System.out.println("Enter 2nd number: ");
        double num2 = input.nextDouble();  // Read the second number from the user
        
        // Swapping the values of num1 and num2
        double swap = num1;  // Store num1 in a temporary variable
        num1 = num2;  // Assign num2 to num1
        num2 = swap;  // Assign the temporary value (original num1) to num2
        
        // Display the swapped numbers
        System.out.println("The swapped numbers are: " + num1 + ", " + num2);
        
        input.close();  // Close the Scanner object to free resources
    }
}