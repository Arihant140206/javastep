import java.util.Scanner;
public class HeightCon {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your height in centimeters: ");
double heightCm = input.nextDouble();
double totalInches = heightCm / 2.54;
int feet = (int) (totalInches / 12);
double inches = totalInches % 12;
System.out.println("Your Height in cm is " + heightCm +
" while in feet is " + feet +
" and inches is " + inches);
input.close();
}
}