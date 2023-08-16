package collegemanagement.client;

import java.util.Scanner;

import collegemanagement.service.Aes;
import collegemanagement.serviceImpl.Details;

public class Test {

	public static void main(String[] args) {
		System.out.println("*********** College Management System***********");
		Aes col = new Details();
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------------------------------------");
			
			
			System.out.println("Press 1 to add course :-");
			System.out.println("-----------------------------------------");
			System.out.println("Press 2 to view course :- ");
			System.out.println("-----------------------------------------");
			System.out.println("Press 3 to add faculty :-");
			System.out.println("-----------------------------------------");
			System.out.println("Press 4 to view faculty :-");
			System.out.println("-----------------------------------------");
			System.out.println("Press 5 to add batch :-");
			System.out.println("-----------------------------------------");
			System.out.println("Press 6 to view batch:-");
			System.out.println("-----------------------------------------");
			System.out.println("Press 7 to add Student:-");
			System.out.println("-----------------------------------------");
			System.out.println("Press 8 to view student:-");
			System.out.println("-----------------------------------------");
			System.out.println("Press 9 to exit:-");
			System.out.println("-----------------------------------------");
			
			System.out.println("Enter Your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				col.addCourse();
				break;
			case 2:
				col.viewCourse();
				break;
			case 3:
				col.addFaculty();
				break;
			case 4:
				col.viewFaculty();
				break;
			case 5:
				col.addBatch();
				break;
			case 6:
				col.viewBatch();
				break;
			case 7:
				col.addStudent();
				break;
			case 8:
				col.viewStudent();
				break;
			case 9:
				flag = false;
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Please enter Correct Choice");
				break;
			}
		}
	}

}
