import java.util.Scanner;
 public class DiscCalc {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the Student Fee: ");
double fee = input.nextDouble();
System.out.print("Enter the University Discount Percentage: ");
double discountPercent = input.nextDouble();
double discount = (discountPercent / 100.0) * fee;
double discountedFee = fee - discount;
System.out.println("The discount amount is INR " + discount +
" and final discounted fee is INR " + discountedFee);
input.close();
}
}