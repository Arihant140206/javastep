import java.util.Scanner;
public class largestnum{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number ");
int num1 = scanner.nextInt();
System.out.print("Enter second number ");
int num2 = scanner.nextInt();
System.out.print("Enter third number ");
int num3  = scanner.nextInt();
if(num1 >num2 && num1>num3){
System.out.println(" Is the first number the largest? yes");
if(num2 >num1 && num2>num3){
System.out.println(" Is the second number the largest? yes");
if(num3>num1 && num3>num2){
System.out.println(" Is the third number the largest? yes");

}else{
	System.out.print("ERROR");
}
scanner.close();
}
} 

