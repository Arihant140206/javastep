import java.util.Scanner; // Import Scanner class to take user input

class TemperaturConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creating Scanner object for user input
		
		
		System.out.println("Enter temperature in Celsius:");
		double celsius = input.nextDouble(); 
		
		double farenheitResult  =(celsius*9/5)+32;
		System.out.println("The "+celsius+" celsius is "+farenheitResult+" fahrenheit");

		
		input.close(); // Closing the Scanner object to prevent resource leaks
}
}