import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("[1] - Addition");
        System.out.println("[2] - Subtraction");
        System.out.println("[3] - Multiplication");
        System.out.println("[4] - Division");
        System.out.println("[5] - Power (elevate)");

        try {
            int operation = scan.nextInt();

            if (operation < 1 || operation > 5) {
                System.out.println("Error: invalid operation. Please choose a number from 1 to 5.");
                return;
            }
            System.out.print("Enter the first number: ");
            double first_number = scan.nextDouble();

            System.out.print("Enter the second number: ");
            double second_number = scan.nextDouble();
            double result;

            switch (operation) {
                case 1:
                    result = first_number + second_number;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = first_number - second_number;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = first_number * second_number;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (second_number == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = first_number / second_number;
                        System.out.println("Result: " + result);
                    }
                    break;
                case 5:
                    result = Math.pow(first_number, second_number);
                    System.out.println("Result: " + result);
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        }
    }
}
