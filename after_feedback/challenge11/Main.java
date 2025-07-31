package after_feedback.challenge11;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 3000);
        Product p2 = new Product("Mouse", 100);
        Product p3 = new Product("Teclado", 200);

        Cart cart = new Cart();
        cart.add(p1, 1);
        cart.add(p2, 2);
        cart.add(p3, 1);

        System.out.println("Before discount:");
        cart.showItems();

        p1.applyDiscount(10);

        System.out.println("\nAfter 10% discount on Notebook:");
        cart.showItems();

        cart.remove("Mouse");

        System.out.println("\nAfter removing Mouse:");
        cart.showItems();
    }
}
