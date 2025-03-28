import java.util.Scanner;

public class input2{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.print("Enter the starting city: ");
String fromCity = scanner.nextLine();
System.out.print("Enter the via city: ");
String viaCity = scanner.nextLine();
System.out.print("Enter the destination city: ");
String toCity = scanner.nextLine();
System.out.print("Enter the distance from starting city to via city (in miles): ");
double distanceFromToVia = scanner.nextDouble();
System.out.print("Enter the distance from via city to destination (in miles): ");
double distanceViaToFinal = scanner.nextDouble();
double totalDistance = distanceFromToVia + distanceViaToFinal;
System.out.print("Enter the total time taken for the journey (in hours): ");
double timeTaken = scanner.nextDouble();
System.out.print("Enter the travel fee: ");
double fee = scanner.nextDouble();
System.out.print("Enter the discount percentage: ");
double discountPercent = scanner.nextDouble();
double discountAmount = (fee * discountPercent) / 100;
double finalFee = fee - discountAmount;
double result1 = totalDistance / timeTaken + fee;
double result2 = fee - discountAmount * 2;
double result3 = (fee - discountAmount) * 2;
System.out.println("\n" + name + ", your travel details are as follows:");
System.out.println("Route: " + fromCity + "," + viaCity + ", " + toCity);
System.out.println("Total Distance: " + totalDistance + " miles");
System.out.println("Total Time Taken: " + timeTaken + " hours");
System.out.println("Original Fee: $" + fee);
System.out.println("Discount Applied: $" + discountAmount);
System.out.println("Final Fee After Discount: $" + finalFee);
System.out.println("The results of Int Operations are " + result1 + "+ result3");
scanner.close();

}
}