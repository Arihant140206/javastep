import java.util.Scanner;
public class numdiv{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number ");
int num = scanner.nextInt();
if(num % 5 == 0){
System.out.print(" Is the number"+num+ "divisible by 5? yes");	

}else{
	System.out.print("Not divisible");
}
input.close();
}
}