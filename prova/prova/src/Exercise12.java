import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12 {
    static public void main(String... argv) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        int userInput = scan.nextInt();
        while (userInput != -1){
            numbersList.add(userInput);

            userInput = scan.nextInt();
        }

        int sum = 0;

        for (int idx : numbersList){
            sum += idx;
        }

        System.out.println("Sum = " + sum);
    }
}
