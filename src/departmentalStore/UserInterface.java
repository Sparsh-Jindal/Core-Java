package departmentalStore;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Costumer Name:");
		String customerName=sc.nextLine();
		
		System.out.println("Enter the Phone Number:");
		String phoneNumber=sc.nextLine();
		
		System.out.print("Enter the Street Name:");
		String streetName=sc.nextLine();
		
		System.out.print("Enter the bill amount:");
		double billAmount=sc.nextDouble();
		
		System.out.print("Enter the distance:");
		int distance=sc.nextInt();
		
		CustomerDetails c=new CustomerDetails(customerName,phoneNumber,streetName,billAmount,distance);
		System.out.println();
		System.out.println("Customer Name:"+c.getCustomerName());
		System.out.println("Phone Number:"+c.getPhoneNumber());
		System.out.println("Street Name:"+c.getStreetName());
		System.out.println("Bonous points"+c.calculateBonusPoints());
		System.out.println("Delivery Charge:"+c.deliveryCharge());
		
	}

}
