package list_03.src;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String... argv) {
        Scanner scan = new Scanner(System.in);

        double travelValue = 3000.0;

        System.out.println("Where do you intend to spend your vacations? \n[1] - Maceió\n[2] - Porto de Galinhas");
        String vacationLocal = scan.nextLine();

        System.out.println("Do you want lunch/dinner included?\n[1] - Yes\n[0] - No");
        int lunchAndDinner = scan.nextInt();

        if (vacationLocal.equals("1") && lunchAndDinner == 1) {
            double totalValue = travelValue * 2;
            System.out.println("You chose Maceió, with lunch/dinner included. Total value: " + totalValue);
        } else if (vacationLocal.equals("1") && lunchAndDinner == 0) {
            double totalValue = travelValue * 1.85;
            System.out.println("You chose Maceió, without lunch/dinner included. Total value: " + totalValue);
        } else if (vacationLocal.equals("2") && lunchAndDinner == 1) {
            double totalValue = travelValue * 1.60;
            System.out.println("You chose Porto de Galinhas, with lunch/dinner included. Total value: " + totalValue);
        } else if (vacationLocal.equals("2") && lunchAndDinner == 0) {
            double totalValue = travelValue * 1.45;
            System.out.println("You chose Porto de Galinhas, without lunch/dinner included. Total value: " + totalValue);
        } else {
            System.out.println("You entered an invalid value!");
        }

        scan.close();
    }
}
