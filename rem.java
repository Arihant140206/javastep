import java.util.Scanner;

public class rem{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter num1");

	double  num1= input.nextDouble();

	System.out.print("enter num2");

	double num2= input.nextDouble();


	double qnt=num1/num2;
	double rem=num1%num2;

	
	System.out.println("qnt is"+qnt+"remainder is"+rem);
    input.close();
    }
}