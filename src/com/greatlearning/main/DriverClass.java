package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.utils.Constants;

public class DriverClass {
	public static Employee employee = new Employee("Sravan Kumar Reddy","Bontha");
	public static String department;
	public static CredentialService credentialService = new CredentialService();
	public static Scanner scanner = new Scanner(System.in);
	public static void displayMenu() {
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Techincal");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}
	public static void main(String args[]) {
//		System.out.println(employee.getFirstName());
//		System.out.println(employee.getLastName());
		
		displayMenu();
		int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				department = Constants.TECHNICAL_DEPARTMENT;
//				System.out.println("Chosen department is "+department);
				break;
			case 2:
				department = Constants.ADMIN_DEPARTMENT;
//				System.out.println("Chosen department is "+department);
				break;
			case 3:
				department = Constants.HR_DEPARTMENT;
//				System.out.println("Chosen department is "+department);
				break;
			case 4:
				department = Constants.LEGAL_DEPARTMENT;
//				System.out.println("Chosen department is "+department);
				break;
			default:
				System.out.println("Invalid Option chosen");
				break;
		}
		if(department!=null) {
			credentialService.showCredentials(employee.getFirstName(), employee.getLastName(), department);
		}
		/*if(choice==1||choice==2||choice==3||choice==4) {
			credentialService.showCredentials(employee.getFirstName(), employee.getLastName(), department);
		}*/
		
	}
}
