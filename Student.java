package Java_Assignment5;

public class Student {
	private String name;
	private int age;
	private String address;

	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}

	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
