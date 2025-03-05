package CollegeFee;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter Student Id:");
	        int studentId = scanner.nextInt();
	        scanner.nextLine();
	        
	        System.out.print("Enter Student name:");
	        String studentName = scanner.nextLine();

	        System.out.print("Enter Department name:");
	        String department = scanner.nextLine();

	        System.out.print("Enter gender:");
	        String gender = scanner.nextLine();

	        System.out.print("Enter category:");
	        String category = scanner.nextLine();

	        System.out.print("Enter College fee:");
	        double collegeFee = scanner.nextDouble();
	        
	        if (category.equals("Hosteller")) {
	            System.out.println("Enter the room number");
	            int roomNumber = scanner.nextInt();
	            scanner.nextLine();
	            
	            System.out.println("Enter the Block name");
	            char blockName = scanner.next().charAt(0);
	            scanner.nextLine();
	            
	            System.out.println("Enter the room type");
	            String roomType = scanner.nextLine();
	            
	            Hosteller hosteller = new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber, blockName, roomType);
	            System.out.println("Total College fee is " + hosteller.calculateTotalFee());
	        } else if (category.equals("DayScholar")) {
	            System.out.println("Enter Bus number");
	            int busNumber = scanner.nextInt();
	            
	            System.out.println("Enter the distance");
	            float distance = scanner.nextFloat();
	            
	            DayScholar dayScholar = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
	            System.out.println("Total College fee is=" + dayScholar.calculateTotalFee());
	        }
	        scanner.close();
	    }
	}
