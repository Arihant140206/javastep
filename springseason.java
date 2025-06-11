import java.util.Scanner;
public class springseason{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter month from 1 to 12 ");
int month = scanner.nextInt();
System.out.print("Enter date from 1 to 30 ");
int date = scanner.nextInt();


if (month >= 3 && date > 20) {
    System.out.println("it is spring season ");
} else if (month <= 6 && date < 20) {
    System.out.println("it is spring season");
} else {
        System.out.println("it is not spring season");
}

scanner.close();
}
}
