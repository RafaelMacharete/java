import java.util.Scanner;

public class Exercise11 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();

        System.out.println(firstNumber % 2 == 0 ? "é par" : "é ímpar");
    }
}
