import java.util.Scanner;

public class ExampleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("The number entered was: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! Enter an integer.");
        }
    }
}

