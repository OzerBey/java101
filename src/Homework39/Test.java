package Homework39;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of employee");
		String name = scan.nextLine();
		System.out.println("Enter salary of employee");
		int salary = scan.nextInt();
		System.out.println("Enter workHours of employee");
		int workHours = scan.nextInt();
		System.out.println("Enter hire year of employee");
		int hireYear = scan.nextInt();
		Employee employee = new Employee(name, salary, workHours, hireYear);
		employee.setWorkHours(45);
		employee.setHireYear(1985);
		System.out.println(employee.toString());
		System.out.println(employee.tax(salary));
		System.out.println(employee.bonus(salary, workHours));

	}
}
