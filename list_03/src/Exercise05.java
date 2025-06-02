package list_03.src;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String... argv) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Current Stock:");
        int quantityInStock = scan.nextInt();

        System.out.println("Maximum Quantity: ");
        int maximumQuantity = scan.nextInt();

        System.out.println("Minimum Quantity: ");
        int minimumQuantity = scan.nextInt();

        int avarageOfQuanitity = (maximumQuantity + minimumQuantity) / 2;
    
        if(quantityInStock >= avarageOfQuanitity){
            System.out.println("Do not make purchase");
        }else{
            System.out.println("Make purchase");
        }

        scan.close();
    }
}
