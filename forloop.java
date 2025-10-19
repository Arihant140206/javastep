import java.util.Scanner;
public class forloop{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number from 1 to 10");
int num = scanner.nextInt();


 for (int num = 10 ; num > 1 ; num--) {
            System.out.println(num);
        }
    


scanner.close();
}
}
