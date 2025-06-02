package list_06.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise04 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        System.out.println("Enter a increasement: ");
        int increasement = scan.nextInt();

        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        int count = 0;
        while (count <= number){
            numbersList.add(count);
            count += increasement;
        }

        System.out.println(numbersList);
        scan.close();
    }
}
