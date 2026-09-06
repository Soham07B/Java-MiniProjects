public class Product {
    String name;
    double price;
    int quantity;

    // Constructor to easily create products from user input
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}