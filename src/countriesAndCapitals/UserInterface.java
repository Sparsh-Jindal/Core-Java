package countriesAndCapitals;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Country p = new Country();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");

			System.out.println("Enter your choice");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("Enter the country name");
				String country = sc.nextLine();
				System.out.println("Enter the city name");
				String city = sc.nextLine();
				p.add(country,city);
				break;
			case 2:
				System.out.println("Enter the country name");
				String con = sc.nextLine();
				String cr= p.search(con);
				System.out.println(cr);
				break;
			case 3:
				System.out.println("Thank you for using the application");
				break;
			default :
				System.out.println("Invalid choice");
				break;

			}
		} while (choice != 3);
		sc.close();
	}

}
