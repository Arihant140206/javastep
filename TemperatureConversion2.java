import java.util.Scanner;  // Import the Scanner class for user input

class TemperatureConversion2 {  // Class name should follow Java naming conventions (PascalCase)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object for user input
        
        // Prompt the user to enter the temperature in Fahrenheit
        System.out.println("Enter temperature in Fahrenheit: ");
        
        double fahrenheit = input.nextDouble();  // Read the temperature input from the user
        
        // Convert Fahrenheit to Celsius using the formula: (F - 32) * (5/9)
        double celsiusResult = (fahrenheit - 32) * (5.0 / 9.0);
        
        // Display the converted temperature
        System.out.println("The temperature " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
        
        input.close();  // Close the Scanner object to free resources
    }
}