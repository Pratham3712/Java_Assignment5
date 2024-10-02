package Java_Assignment5;

public class PersonMain {

	public static void main(String[] args) {
		Employee employee = new Employee("Praduny", 340000);
		employee.work();
		employee.getSalary();
		System.out.println("======================================");
		HRManager hrmanager = new HRManager("Patil", 34700);
		hrmanager.work();
		hrmanager.addEmployee("Sanjay");

	}

}
