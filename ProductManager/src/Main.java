import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>(); 
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n🛒 Product Manager Menu:");
            System.out.println("1. Add product");
            System.out.println("2. List products");
            System.out.println("3. Search product");
            System.out.println("4. Remove product");
            System.out.println("5. Calculate total inventory value");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                
                try {
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    
                    System.out.print("Enter category (ELECTRONICS, SPORTS_GEAR, COURSE_MATERIALS, OTHER): ");
                    String categoryInput = scanner.next(); 
                    
                    Product.Category category = Product.Category.valueOf(categoryInput.toUpperCase());
                    
                    Product newProduct = new Product(name, price, quantity, category);
                    inventory.add(newProduct);
                    
                    System.out.println("✅ " + name + " added to inventory!");
                    
                } catch (Exception e) {
                    System.out.println("❌ Invalid input! Please check your numbers or category spelling.");
                } finally {
                    scanner.nextLine(); 
                }
                
            } else if (choice == 2) {
                if (inventory.isEmpty()) {
                    System.out.println("The inventory is currently empty.");
                } else {
                    System.out.println("\n📦 Current Inventory:");
                    for (Product item : inventory) {
                        System.out.println("- [" + item.category + "] " + item.name + " | Price: $" + item.price + " | Qty: " + item.quantity);
                    }
                }
                
            } else if (choice == 3) {
                System.out.print("Enter the name of the product to search: ");
                String searchName = scanner.nextLine();
                
                boolean found = false; 
                for (Product item : inventory) {
                    if (item.name.equalsIgnoreCase(searchName)) {
                        System.out.println("✅ Found: [" + item.category + "] " + item.name + " | Price: $" + item.price + " | Qty: " + item.quantity);
                        found = true;
                        break; 
                    }
                }

                if (!found) {
                    System.out.println("❌ Product '" + searchName + "' not found in inventory.");
                }
                
            } else if (choice == 4) {
                System.out.print("Enter the name of the product to remove: ");
                String removeName = scanner.nextLine();
                
                Product productToRemove = null; 

                for (Product item : inventory) {
                    if (item.name.equalsIgnoreCase(removeName)) {
                        productToRemove = item;
                        break; 
                    }
                }

                if (productToRemove != null) {
                    inventory.remove(productToRemove);
                    System.out.println("🗑️ Successfully removed " + productToRemove.name + " from inventory.");
                } else {
                    System.out.println("❌ Product '" + removeName + "' not found.");
                }
                
            } else if (choice == 5) {
                double totalValue = 0.0; 

                for (Product item : inventory) {
                    totalValue += (item.price * item.quantity); 
                }

                System.out.println("💰 Total Inventory Value: $" + totalValue);
                
            } else if (choice == 6) {
                System.out.println("Exiting Product Manager. Goodbye!");
                isRunning = false; 
                
            } else {
                System.out.println("Invalid choice. Please pick a number from 1 to 6.");
            }
        }
        
        scanner.close();
    }
}
