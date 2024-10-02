package Java_Assignment5;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		Student[] arr = new Student[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
		}
		arr[0].setInfo("Praduny", 24, "Maskawad sim");
		arr[1].setInfo("Harish", 24, "Maskawad bk");
		arr[2].setInfo("Kaushal", 22, "Maskawad bk");
		arr[3].setInfo("Vishal", 27, "Maskawad bk");
		arr[4].setInfo("Pushkar", 19, "Maskawad bk");
		arr[5].setInfo("Mohan", 23, "Maskawad bk");
		arr[6].setInfo("Narayan", 23, "Maskawad khurd");
		arr[7].setInfo("Dipak", 22, "Maskawad sim");
		arr[8].setInfo("Samrat", 25, "Maskawad sim");
		arr[9].setInfo("Divesh", 22, "Maskawad sim");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

}
