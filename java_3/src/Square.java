
public class Square implements Shape {
	protected double a;

	public Square() {
		this.a = 0;
	}

	public Square(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
	this.a = a;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 4 * a;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return a * a;
	}
}
