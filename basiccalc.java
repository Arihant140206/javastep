import java.util.Scanner;

public class basiccalc{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number");

	double num1 = input.nextDouble();

	System.out.print("enter next number");

	double num2 = input.nextDouble();

	double addition = num1 +num2 ;
	double subtraction = num1 -num2 ;
	double multiplication = num1 *num2 ;
	double division = num2 != 0 ?num1 /num2 : Double.NaN ;
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1 +"and" +num2 +"is"+addition+"," +subtraction+","+ multiplication+" and "+division);
    input.close();
    }
}