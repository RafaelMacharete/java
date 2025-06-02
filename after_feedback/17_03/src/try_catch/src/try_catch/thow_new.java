package try_catch;

import java.util.Scanner;

public class thow_new {
    static public void main(String... args){
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            if (age < 18){
                throw new IllegalArgumentException("Error: Minimum age is 18");
            }
            System.out.println("Register sucessfull");
        }catch (IllegalArgumentException e){
            System.out.println("Excepction captured: "+e.getMessage());
        }finally {
            scan.close();
            System.out.println("Programa concluded! ");
        }

    }
}
