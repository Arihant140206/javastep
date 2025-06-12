import java.util.Scanner;
public class zero{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number");
int number = scanner.nextInt();

if (number >0) {
    System.out.println("The number is a positive");
} else if (number <0) {
    System.out.println("The number is a negative");
} else {
        System.out.println("The number is 0");
}

scanner.close();
}
}
