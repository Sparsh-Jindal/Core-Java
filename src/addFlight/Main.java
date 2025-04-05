package addFlight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FlightManagementSystem fms = new FlightManagementSystem();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add flight details");
			System.out.println("2.Get flight details");
			System.out.println("3.Update flight fare");
			System.out.println("4.Delete flight detail");
			System.out.println("5.Get full table");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter Flight id");
				int flightId = Integer.parseInt(sc.nextLine());

				System.out.println("Enter source");
				String source = sc.nextLine();

				System.out.println("Enter destination");
				String destination = sc.nextLine();

				System.out.println("Enter noOfSeats");
				int noOfSeats = Integer.parseInt(sc.nextLine());

				System.out.println("Enter the fare");
				double flightFare = Double.parseDouble(sc.nextLine());

				Flight f = new Flight(flightId, source, destination, noOfSeats, flightFare);
				boolean isAdded = fms.addFlight(f);

				if (isAdded) {
					System.out.println("Flight details added successfully");
				} else {
					System.out.println("Flight details not added successfully");

				}
				break;
			case 2:
				System.out.println("Enter the source");
				String src = sc.nextLine();
				System.out.println("Enter the destination");
				String des = sc.nextLine();
				ArrayList<Flight> flightDetails = fms.viewFlightBySourceAndDestination(src, des);

				if (flightDetails.isEmpty()) {
					System.out.println("No flights available for the given source and destination");
				} else {
					for (Flight fd : flightDetails) {
						System.out.println("Flight ID : " + fd.getFlightId());
						System.out.println("Source : " + fd.getSource());
						System.out.println("Destination : " + fd.getDestination());
						System.out.println("No of seats : " + fd.getNoOfSeats());
						System.out.println("Flight Fare : " + fd.getFlightFare());
						System.out.println();
					}
				}
				break;

			case 3:
				System.out.println("Ener the flightId");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the flightFare to be updated");
				Double fareUpdate = Double.parseDouble(sc.nextLine());
				boolean toCheck = fms.updateFlightFare(id, fareUpdate);

				if (toCheck) {
					System.out.println("Flight Fare updated successfully");
				} else {
					System.out.println("Flight fare not updated. Check for the ID");
				}
				break;

			case 4:
				System.out.println("Enter the flight id");
				int flightDelete = Integer.parseInt(sc.nextLine());
				boolean check = fms.deleteFlight(flightDelete);
				if (check) {
					System.out.println("Flight details deleted successfully");
				} else {
					System.out.println("Flight fare not updated. Check for the ID");
				}
				break;

			case 5:
				ArrayList<Flight> flightTable = fms.viewFullTable();
				if (flightTable.isEmpty()) {
					System.out.println("No flights available for the given source and destination");
				} else {
					for (Flight fd : flightTable) {
						System.out.println("Flight ID : " + fd.getFlightId());
						System.out.println("Source : " + fd.getSource());
						System.out.println("Destination : " + fd.getDestination());
						System.out.println("No of seats : " + fd.getNoOfSeats());
						System.out.println("Flight Fare : " + fd.getFlightFare());
						System.out.println();
					}
				}
				break;

			case 6:
				System.out.println("Thanks for using AirIndia");
				break;
			default:
				System.out.println("Invalid Choice");

			}
		} while (choice != 6);

	}

}
