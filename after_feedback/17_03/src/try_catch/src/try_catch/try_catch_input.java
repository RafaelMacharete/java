package try_catch;

import java.util.Scanner;

public class try_catch_input {
    static public void main (String... args){

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("enter the numerator: ");
            int numerator = scan.nextInt();

            System.out.println("enter the denominator: ");
            int denominator = scan.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: invalid input. Make sure that u inserted a integers values" +e.getMessage());
        } finally {
            System.out.println("Concluded program");
        }
    }

    static public int divide(int a, int b){
        return a / b;
    }

}
