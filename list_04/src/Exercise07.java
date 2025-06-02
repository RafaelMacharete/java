package list_04.src;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String... argv) {
        Scanner scan = new Scanner(System.in);

        double salary = 1500.0;
        double commission = 350.0;

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter the month: ");
        String month = scan.nextLine();

        System.out.println("Enter the cars sold: ");
        int cars = scan.nextInt();

        System.out.println("Enter the total sales: ");
        double salesValue = scan.nextDouble();

        double totalSalary = salary + (commission * cars) + (0.001 * salesValue);

        System.out.printf("The seller: %s\nSold: %.2f on %s\nHis salary for the month is: %.2f\n",
                name, salesValue, month, totalSalary);

        scan.close();

    }
}
