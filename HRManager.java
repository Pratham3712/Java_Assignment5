package Java_Assignment5;

public class HRManager extends Employee {

	public HRManager(String name, double salary) {
		super(name, salary);
	}

	public void work() {
		System.out.println(name + " is managing HR activities.");
	}

	public void addEmployee(String employeeName) {
		System.out.println(name + " has added employee: " + employeeName);
	}

}
