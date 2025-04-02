import java.util.Scanner;

public class side{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter perimeter");

	double perimeter= input.nextDouble();


	double side = perimeter/ 4;
	
	
	System.out.println("perimeter is"+perimeter+"side is"+side);
    input.close();
    }
}