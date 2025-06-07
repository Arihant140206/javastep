import java.util.Scanner;
public class countdown{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number from 1 to 10");
int number = scanner.nextInt();
while (number > 1) {
            number = number - 1;
            System.out.println( number);
        }
    


scanner.close();
}
}
