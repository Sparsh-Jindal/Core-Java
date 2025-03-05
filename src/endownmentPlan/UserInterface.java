package endownmentPlan;

import java.util.Scanner;

public class UserInterface {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Endowment Id:");
		String endowmentId = sc.nextLine();
		
		System.out.print("Enter Holder Name:");
		String holderName=sc.nextLine();
		
		System.out.print("Enter Endowment Type:");
		String endowmentType=sc.nextLine();
		
		if(!endowmentType.equals("Health") || !endowmentType.equals("Educational")) {
			System.out.println();
			System.out.println(endowmentType+": GALAT HAI BHAAIIIIII");
			return;
		}
		
		System.out.print("Enter Registration Date:");
		String regestrationDate=sc.nextLine();
		
		Endowment endowment=null;
		
		if(endowmentType.equals("Educational")) {
			
			System.out.print("Enter Educational Institution:");
			String educationalInstituion = sc.nextLine();
			
			System.out.print("Enter Educational Division:");
			String educationalDivison = sc.nextLine();
			
			endowment = new EducationalEndowmnet(endowmentId,holderName,endowmentType,regestrationDate,educationalInstituion,educationalDivison);
			
			
		}
		
		else if(endowmentType.equals("Health")) {
			
			
			System.out.print("Enter Health Care Center:");
			String healthCareCenter = sc.nextLine();
			
			System.out.print("Enter Holder Age:");
			int holderAge = sc.nextInt();
			
			endowment=new HealthEndowment(endowmentId,holderName,endowmentType,regestrationDate,healthCareCenter,holderAge);
			
			
			
		}
		
		System.out.printf("Endowment Amount: %.9f",endowment.calculateEndownment());

	}

}
