package Java_Assignment5;

public class Rectangle  {
	private double lenght;
	private double breadth;
	private double arearectangle;
	private double parametersrectangle;

	public void getAreaRectangle(double lenght,double breadth) {
		arearectangle = lenght * breadth;
		System.out.println("Area of Recangle= " + arearectangle);
	}

	public void getParametersRectangle(double lenght,double breadth) {
		parametersrectangle = 2 * (lenght + breadth);
		System.out.println("Parameters of Rectangle= " + parametersrectangle);
	}
}
