public class Product {
    
    public enum Category {
        ELECTRONICS, 
        SPORTS_GEAR, 
        COURSE_MATERIALS, 
        OTHER
    }

    String name;
    double price;
    int quantity;
    Category category; 

    public Product(String name, double price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
}
