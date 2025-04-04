package addFlight;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Flight id");
		int flightId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter source");
		String source=sc.nextLine();
		
		System.out.println("Enter destination");
		String destination=sc.nextLine();
		
		System.out.println("entter noOfSeats");
		int noOfSeats=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the fare");
		double flightFare=Double.parseDouble(sc.nextLine());
		
		Flight f=new Flight(flightId, source, destination, noOfSeats, flightFare);
		
		FlightManagementSystem fms= new FlightManagementSystem();
		boolean isAdded=fms.addFlight(f);
		
		if(isAdded) {
			System.out.println("Flight details added successfully");
		}
		else {
			System.out.println("Flight details not added successfully");

		}
		
	}

}
