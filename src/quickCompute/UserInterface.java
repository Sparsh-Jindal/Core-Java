package quickCompute;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumAvg num = new NumAvg();
		Scanner sc = new Scanner(System.in);

		int choice = 0;

		do {
			System.out.println("1.Add number");
			System.out.println("2.Find Average");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("Enter the number");
				int n = Integer.parseInt(sc.nextLine());
				num.addNum(n);
				break;
			case 2:
				if (num.calAvg() == 0) {
					System.out.println("The set is empty");
				}
				else {
					System.out.println(num.calAvg());
				}
				
				break;
			case 3:
				System.out.println("Thank you for using the application");
				break;
			
			default:
				System.out.println("Invail Choice");
				break;
			}

		} while (choice != 3);
	}

}
