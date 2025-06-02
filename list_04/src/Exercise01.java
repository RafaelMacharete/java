package list_04.src;

import java.util.Scanner;
public class Exercise01 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);
        // User name
        System.out.println("Enter your name: ");
        String userName = scan.nextLine();

        // User last name
        System.out.println("Enter your last name: ");
        String userLastName = scan.nextLine();

        // User birthdate
        System.out.println("Enter your date of birth: ");
        String userBirthDate = scan.nextLine();

        // Salary claim
        System.out.println("Enter your salary claim: ");
        String userSalaryClaim = scan.nextLine();

        // Level of education
        System.out.println("Enter your level of education: ");
        String userLevelEduc = scan.nextLine();

        // Position sought

        System.out.println("Enter your position level sought: ");
        byte userPositLevelSought = scan.nextByte();

        System.out.println("Do you have a CNH type 'B'? Y/N: ");
        char cnhB = scan.next().charAt(0);

        System.out.println("\nUser scan Collected:");
        System.out.println("Name: " + userName + " " + userLastName);
        System.out.println("Birth Date: " + userBirthDate );
        System.out.println("Salary Claim: " + userSalaryClaim);
        System.out.println("Level of Education: " + userLevelEduc);
        System.out.println("Position Level Sought: " + userPositLevelSought);
        System.out.println("CNH Type B: " + (cnhB == 'Y' ? "Yes" : "NO"));

        scan.close();
    }
}
