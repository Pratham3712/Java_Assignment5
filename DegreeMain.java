package Java_Assignment5;

public class DegreeMain {

	public static void main(String[] args) {
		Degree degree = new Degree();
		degree.getDegree();
		System.out.println("=====================================");
		Undergraduate undergraduate = new Undergraduate();
		undergraduate.getDegree();
		System.out.println("======================================");
		Postgraduate postgraduate = new Postgraduate();
		postgraduate.getDegree();

	}

}
