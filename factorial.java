import java.util.Scanner; 
class factorial{ 
	public static void main(String[]args){ 
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter a number:"); 
		int n=scanner.nextInt();  
		if(n<0){ 
			System.out.println("Enter a positive number"); 
		}else{ 
			int factorial=1,i=1; 
			while(i<=n){ 
				factorial*=i; 
				i++; 
			} 
				System.out.println("Factorial of "+n+" is "+factorial); 
				scanner.close(); 
		} 
	} 
} 