package carSurvey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Car c = new Car();
		int choice = 0;

		do {
			System.out.println("1.Add car");
			System.out.println("2.Search by name");
			System.out.println("3.Search by count");
			System.out.println("4.Total");
			System.out.println("5.Exit");

			System.out.println("Enter your choice");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("Enter the car name");
				String cName = sc.nextLine();
				System.out.println("Enter no of cars sold");
				int sold = Integer.parseInt(sc.nextLine());
				c.addCar(cName, sold);
				break;
			case 2:
				if (!c.toCheck()) {
					System.out.println("Enter the car name");
					String sName = sc.nextLine();
					
					int sell=c.carByName(sName);
					System.out.println(sell==0 ?"Car not found":sell);
				}
				else {
					System.out.println("Map is empty");
				}
				break;
			case 3:

				System.out.println("Enter the count");
				int count = Integer.parseInt(sc.nextLine());
				List<String> ls = new ArrayList<>();
				ls = c.carByCount(count);
				if (ls.isEmpty()) {
					System.out.println("No car found");
				} else {
					for (String name : ls) {
						System.out.println(name);	
					}
				}

				break;
			case 4:
				if(c.toCheck()) {
					System.out.println("Map is empty");
				}
				else {
					System.out.println(c.totalCarsSold());
				}
				break;
			case 5:
				System.out.println("Thank you for using the application");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}

		while (choice != 5);
		sc.close();
	}

}
