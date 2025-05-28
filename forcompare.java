import java.util.Scanner; 
class forcompare{ 
	public static void main(String[]args){ 
		Scanner scanner=new Scanner(System.in); 
		int total=0; 
		System.out.println("Enter a number"); 
		int n=scanner.nextInt(); 
		if(n<=0){ 
			System.out.println("Enter a positive number"); 
		}else{ 
			int sum=n*(n+1)/2; 
			int i; 
			int forsum=0; 
			for(i=1;i<=n;i++){ 
				forsum+=i; 
			} 
			if(sum==forsum){ 
				System.out.println("Both are equal"); 
			}else{ 
				System.out.println("Both are not equal"); 
			} 
		} 
	} 
} 
	