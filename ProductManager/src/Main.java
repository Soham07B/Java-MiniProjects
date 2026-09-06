import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Database for this project
        ArrayList<Product> inventory = new ArrayList<>(); 
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n Product Manager Menu:");
            System.out.println("1. Add product");
            System.out.println("2. List products");
            System.out.println("3. Search product");
            System.out.println("4. Remove product");
            System.out.println("5. Calculate total inventory value");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // This prevents a common Scanner bug by consuming the Enter key

            if (choice == 1) 
            {
                // TODO: Ask user for name, price, and quantity. 
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
    
                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();
    
                System.out.print("Enter product quantity: ");
                int quantity = scanner.nextInt();
                // Create a new Product and add it to the inventory list.
                Product newProduct = new Product(name, price, quantity);
    
                // Save it to the ArrayList
                inventory.add(newProduct);
    
                System.out.println("✅ " + name + " added to inventory!");
                
            } 
            
            else if (choice == 2) 
            {
                // TODO: Use a for loop to print every product in the inventory.
                if (inventory.isEmpty()) 
                {
                    System.out.println("The inventory is currently empty.");
                } 
                else 
                {
                    System.out.println("\n📦 Current Inventory:");
        
                    // 2. The enhanced for loop (what you asked about in your very first question!)
                    for (Product item : inventory) 
                    {
                        System.out.println("- " + item.name + " | Price: $" + item.price + " | Qty: " + item.quantity);
                    }
                }
              
                
            } else if (choice == 3) {
                // TODO: Ask for a name, loop through the list, and print if found.
                
            } else if (choice == 4) {
                // TODO: Ask for a name, find it, and remove it from the list.
                
            } else if (choice == 5) {
                // TODO: Multiply price by quantity for every product and add to a total.
                
            } else if (choice == 6) {
                System.out.println("Exiting Product Manager. Goodbye!");
                isRunning = false; // This breaks the loop
                
            } else {
                System.out.println("Invalid choice. Please pick a number from 1 to 6.");
            }
        }
        
        scanner.close();
    }
}