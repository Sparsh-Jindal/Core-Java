   package shopingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Products p = new Products();
		p.setProductList(new ArrayList<String>());
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");

			System.out.println("Enter your choice");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("Enter the product");
				String s = sc.nextLine();
				p.addProductToList(s);
				break;
			case 2:
				p.sortProductList();
				break;
			case 3:
				System.out.println("Thank you for using the application");
				break;
			default :
				System.out.println("Invalid choice");
				break;

			}
		} while (choice != 3);
	}

}
