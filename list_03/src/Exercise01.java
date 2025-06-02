package list_03.src;

import java.util.Scanner;
public class Exercise01 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if(age >= 0 && age <= 14){
            System.out.println("Classification: Kid");
        }else if(age <= 17){
            System.out.println("Classification: Adolescent");
        }else if(age <= 30){
            System.out.println("Classification: Young Adult");
        }else{
            System.out.println("Classification: Adult");
        }

        scan.close();
    }
}
