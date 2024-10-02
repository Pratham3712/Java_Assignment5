package Java_Assignment5;

public class Square {
	private double side;
	private double areasquare;
	private double parametersSquare;

	public void getAreaSquare(double side) {
		areasquare = side * side;
		System.out.println("Area of square=  " + areasquare);
	}

	public void getParametersSquare(double side) {
		parametersSquare = 4 * side;
		System.out.println("parameters of Square=  " + parametersSquare);
	}

}
