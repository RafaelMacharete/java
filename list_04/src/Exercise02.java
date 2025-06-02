package list_04.src;

import java.util.Scanner;

public class Exercise02 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer number: ");
        int number1 = scan.nextInt();

        System.out.println("Enter another integer number: ");
        int number2 = scan.nextInt();

        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        if (number2 != 0){
            System.out.println("Division: " + (number1 / number2));
        }else{
            System.out.println("Division can not be carried out");
        }
        System.out.println("High: " + (Math.pow(number1, number2)));
        System.out.println("Mod: " + number1 % number2);

        scan.close();
    }

}
