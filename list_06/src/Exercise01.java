package list_06.src;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise01 {
    static public void main(String... argv) {
        Scanner scan = new Scanner(System.in);
        int numbersList[] = new int[10];

        int count = 0;

        while (count < 9) {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            numbersList[count] = number;
            count++;
        }
        System.out.println(Arrays.toString(numbersList));

        System.out.println("Enter what u want to know:\n[1] - Even numbers\n[2] - Odd numbers\n[3] - Negative numbers\n[4] - Positive numbers\n[5] - Exit");
        int option = scan.nextInt();

        switch (option){
            case 1:
                int evenCount = 0;
                for (int number : numbersList){
                    if (number % 2 == 0){
                        evenCount++;
                }
            }
                System.out.println(evenCount + " even numbers");
                break;

            case 2:
                int oddCount = 0;
                for (int number : numbersList){
                    if (number % 2 != 0){
                        oddCount++;
                    }
                }
                System.out.println(oddCount + " odd numbers");
                break;

            case 3:
                int negativeCount = 0;
                for (int number : numbersList){
                    if (number < 0){
                        negativeCount++;
                    }
                }
                System.out.println(negativeCount + " negative numbers");
                break;

            case 4:
                int positiveNumbers = 0;
                for (int number : numbersList){
                    if (number > 0){
                        positiveNumbers++;
                    }
                }
                System.out.println(positiveNumbers + " positive numbers");
                break;

            case 5:
                System.exit(0);
                break;
        }

        scan.close();
    }
}
