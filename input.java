import java.util.Scanner;

public class input{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter num1");

	Double a= input.nextDouble();

	System.out.print("enter num2");

	Double b= input.nextDouble();


	System.out.print("enter num3");

	 
	 
	 	Double c= input.nextDouble();

	Double result1= a + b *c;
    	Double result2= a * b + c;
    	Double result3= c + a / b;
    	Double result4=  a % b + c;

	
	System.out.println("The results of Int Operations are"+result1 +","+result2 +","+result3+"and"+result4);
    input.close();
    }
}