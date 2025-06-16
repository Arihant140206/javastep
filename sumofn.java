import java.util.Scanner;
public class sumofn{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number ");
int n = scanner.nextInt();

if(n > 0){
	int sum =  n * (n+1) / 2 ;


System.out.println(" sum of natural number is"+ sum);
else{
System.out.println("The number"+ n + "is not a natural number");	
}
}

scanner.close();
}
} 

