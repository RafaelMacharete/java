package list_04.src;

import java.util.Scanner;
public class Exercise03 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your purchase value: ");
        double purchaseValue = scan.nextDouble();

        double salePrice = purchaseValue + (purchaseValue * 0.20) + (purchaseValue * 0.30);

        System.out.println("Purchase Value: " + purchaseValue + "\nRepresentative sale: " + (purchaseValue * 0.20) + "\nTax: " + (purchaseValue * 0.30));
        scan.close();

    }
}
