package vivekFurniture;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting customer details
        System.out.println("Enter Customer Name");
        String name = scanner.nextLine();

        System.out.println("Enter Phone Number");
        long phone = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter address");
        String address = scanner.nextLine();

        CustomerDetails customer = new CustomerDetails(name, phone, address);

        System.out.println("Enter Bero Type");
        String beroType = scanner.nextLine();

        Bero bero = null;

        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();

            System.out.println("Enter Bero Height");
            int beroHeight = scanner.nextInt();

            bero = new SteelBero(beroType, beroColour, beroHeight);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();

            System.out.println("Enter Wood Type");
            String woodType = scanner.nextLine();

            bero = new WoodenBero(beroType, beroColour, woodType);
        } else {
            System.out.println(beroType + " is an invalid bero type");
            scanner.close();
            return;
        }

        bero.calculatePrice();
        Discount discount = new Discount();
        double discountAmount = discount.calculateDiscount(bero);
        double totalPrice = bero.getPrice() - discountAmount;

        System.out.printf("Amount needs to be paid %.2f\n", totalPrice);
        scanner.close();
    }
}

