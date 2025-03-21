import java.util.Scanner;

public class area{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter base number");

	double base= input.nextDouble();

	System.out.print("enter height number");

	double height = input.nextDouble();

	double area= 0.5 * base * height ;
	double areainch = area/6.4516  ;
	
	System.out.println("the area in cm is"+area+"and inch area"+areainch);
    input.close();
    }
}