package schoolTeam;

import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassHouseFormation c=new ClassHouseFormation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num=Integer.parseInt(sc.nextLine());
		if(num<=0) {
			System.out.println("Invalid Input");
			return ;
		}
		
		System.out.println("Enter the details");
		
		for(int i=0;i<num;i++) {
			String details=sc.nextLine();
			c.addName(details);
		}
//		c.display();
		
		HashSet<String> teamSet=c.formTeam();
		
		for(String team:teamSet) {
			System.out.println(team);
		}
		
		sc.close();
	}

}
