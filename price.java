import java.util.Scanner;

public class price{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter price");

	double  price= input.nextDouble();

	System.out.print("enter qnty");

	double qn= input.nextDouble();


	double totprice= price*qn;

	
	System.out.println("total price is "+totprice);
    input.close();
    }
}