import java.util.Scanner;

public class feet{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter feet");

	double feet= input.nextDouble();


	double yards= feet/ 3;
	double miles = feet/1760;
	
	System.out.println("feekt is"+feet+"yards  is "+yards+"miles is "+miles);
    input.close();
    }
}