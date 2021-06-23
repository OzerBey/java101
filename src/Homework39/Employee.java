package Homework39;

public class Employee {

	private String name;
	private int salary;
	private int workHours;
	private int hireYear;

	public Employee() {

	}

	public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public int tax(int salary) {
		int result = 0;
		if (!checkItSalary(salary)) {
			result = (int) ((salary) - (salary * .03));
			return result;
		}
		return salary;
	}

	private boolean checkItSalary(int salary) {
		boolean result = salary < 1000 ? true : false;
		return result;
	}

	public int bonus(int salary, int hours) {
		return (salary + (hours * 30));
	}

	public int raiseSalary(int salary, int yearOfEntry) {
		int rate = raiseWhatPercentForExperience(yearOfEntry);
		return salary + salary * (rate / 100);
	}

	private int raiseWhatPercentForExperience(int year) {
		int currentYear = 2021, experience = currentYear - year, rate = 0;
		if (experience <= 9) {
			rate = 5;
		} else if (experience > 9 && experience >= 19) {
			rate = 10;
		} else {
			rate = 15;
		}
		return rate;
	}

	@Override
	public String toString() {
		return "infos of Employee : \n name=" + name + "\n" + " salary=" + salary + "\n workHours=" + workHours
				+ "\n hireYear=" + hireYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

}
