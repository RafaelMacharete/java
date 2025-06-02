package list_04.src;

import java.util.Scanner;
public class Exercise06 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the note 1: ");
        int note1 = scan.nextInt();

        System.out.println("Enter the note 2: ");
        int note2 = scan.nextInt();

        double grade = (note1 * 4 + note2 * 6) / 10;
        System.out.println("Grade: " + grade);
        scan.close();

    }
}
