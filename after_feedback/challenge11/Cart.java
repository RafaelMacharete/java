package after_feedback.challenge11;

import java.util.ArrayList;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();

    void add(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.product.price * item.quantity;
        }
        return total;
    }

    void showItems() {
        for (CartItem item : items) {
            System.out.println(item.product.name + " - $" + item.product.price + " x" + item.quantity);
        }
        System.out.println("Total: $" + getTotal());
    }

    void remove(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).product.name.equalsIgnoreCase(name)) {
                items.remove(i);
                break;
            }
        }
    }
}
