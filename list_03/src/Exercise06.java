package list_03.src;
import java.util.Scanner;
import java.util.Random;

public class Exercise06{
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);
        Random numberRandom = new Random();

        int numberRandomized = numberRandom.nextInt(100 ) + 1;

        // System.out.println(numberRandomized);
        int userChance = 3;

        while (userChance >= 1){
            System.out.println("Enter a number: ");
            int guessedNumber = scan.nextInt();

            if (guessedNumber == numberRandomized){
                System.out.println("You guessed right!");
                break;
            }else{
                System.out.println("You guessed wrong!");
                userChance--;
            }
        }
        scan.close();
    }
}
