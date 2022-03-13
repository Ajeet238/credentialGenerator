package credentialGenerator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(("Please Enter The Department From The Following"));
		System.out.println(("1.Technical"));
		System.out.println(("2.Admin"));
		System.out.println(("3.Human Resource"));
		System.out.println(("4.Legal"));
		int department = sc.nextInt();

		Department dep = new Department();
		CredentialService cred = new CredentialService();
		Employee emp = new Employee("Amit", "Kumar");
		switch (department) {
		case 1:
			dep.setDepartment("Technical");
			String dept = dep.getDepartment();
			cred.showCredential(emp.firstName, emp.lastName, dept);
			break;
		case 2:
			dep.setDepartment("Admin");
			String dept2 = dep.getDepartment();
			cred.showCredential(emp.firstName, emp.lastName, dept2);
			break;
		case 3:
			dep.setDepartment("Human Resource");
			String dept3 = dep.getDepartment();
			cred.showCredential(emp.firstName, emp.lastName, dept3);
			break;
		case 4:
			dep.setDepartment("Legal");
			String dept4 = dep.getDepartment();
			cred.showCredential(emp.firstName, emp.lastName, dept4);
			break;
		default:
			System.out.print("Invalid Entry");

		}

	}

}
