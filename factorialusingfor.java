import java.util.Scanner;
class factorialusingfor{ 
	public static void main(String[]args){ 
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter a number:"); 
		int n=scanner.nextInt(); 
		if(n<0){ 
			System.out.println("Enter a positive number"); 
		}else{ 
			int factorial=1;
			for(int i=1;i<=n;i++){ 
				factorial*=i; 
			} 
			System.out.println("The factorial of the given number "+n+" is "+factorial); 
			scanner.close(); 
			} 
		} 
	} 