package list_03.src;
import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Question 01: How much is 2 + 2: ");
        System.out.println("Question 02: How much is 1 + 0: ");

        System.out.println("Choose 1 question: \n[1] - Question 01\n[2] - Question 02");
        int questionChoose = scan.nextInt();

        System.out.println(questionChoose);

        if (questionChoose == 1){
            System.out.println("Options:\n[a] - 5\n[b] - 4\n[c] - 0");
            String anwserChoosed = scan.next().toUpperCase();
            if (anwserChoosed.equals("B")){
                System.out.println("You answered right, take your bonus on Shostners and Shostners");
            }else{
                System.out.println("You answered wrong, try again later");
            }
        }else if(questionChoose == 2){
            System.out.println("Options:\n[a] - 1\n[b] - 3\n[c] - 5");
            String anwserChoosed = scan.next().toUpperCase();
            if (anwserChoosed.equals("A")){
                System.out.println("You answered right, take your bonus on Shostners and Shostners");
            }else{
                System.out.println("You answered wrong, try again later");
            }
        }

        scan.close();
    }
}
