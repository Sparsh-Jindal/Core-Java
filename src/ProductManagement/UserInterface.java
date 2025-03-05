package ProductManagement;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();
        
        Product product = new Product(productId, productName, price, quantity);
        System.out.println();
        product.displayProductDetails();
        
        scanner.close();
    }
}
