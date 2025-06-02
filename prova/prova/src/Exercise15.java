import java.util.Scanner;

public class Exercise15 {
    public static void main(String... argv) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the total purchase value");
        double purchaseValue = scan.nextDouble();

        System.out.println("Enter the type of client:\n[1] - Common\n[2] - Gold\n[3] - Premium");

        int typeOfClient = scan.nextInt();

        if (typeOfClient == 1){
            System.out.println("You do not have discount on your purchase: " + purchaseValue + "R$");
        }else if (typeOfClient == 2){
            double totalPurchase = purchaseValue * 0.95;
            System.out.println("You have 5% of discount on your purchase: " + totalPurchase + "R$");
        }else{
            double totalPurchase = purchaseValue * 0.90;
            System.out.println("You have 10% of discount on your purchase: " + totalPurchase + "R$");
        }
    }
}
