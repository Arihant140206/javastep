import java.util.Scanner; 
class table{ 
	public static void main(String[]args){ 
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter a number between 6 to 9"); 
		int n=scanner.nextInt(); 
		if(n>=6 || n<=9){ 
			for(int i=1; i<=10; i++){ 
				int table=i*n; 
				System.out.println(n+ "*" +i+ "=" +table); 
			} 
		}else{ 
			System.out.println("Enter a valid number"); 
			scanner.close(); 
		} 
	} 
} 