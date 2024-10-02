package Java_Assignment5;

public class Employee  extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }

}
