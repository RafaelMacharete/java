package after_feedback.challenge11;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double percent) {
        price -= price * (percent / 100);
    }
}
