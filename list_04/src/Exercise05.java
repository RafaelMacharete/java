package list_04.src;

import java.util.Scanner;

public class Exercise05 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the hour: ");
        int hour = scan.nextInt();

        System.out.println("Enter the minutes: ");
        int minutes = scan.nextInt();

        System.out.println("Enter the seconds: ");
        int second = scan.nextInt();

        int hourInSeconds = hour * 60 * 60;
        int minutesInSeconds = minutes * 60;

        int totalSeconds = hourInSeconds + minutesInSeconds + second;

        System.out.println("Total seconds: " + totalSeconds);
        scan.close();

    }
}
