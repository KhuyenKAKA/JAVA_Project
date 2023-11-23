
public class resizableSquare extends Square implements Resizable {
	private double new_a;

	public resizableSquare() {
		super();
	}

	public resizableSquare(double a, double new_a) {
		super(a);
		this.new_a = new_a;
	}

	public double getNew_a() {
		return new_a;
	}

	public void setNew_a(double new_a) {
		this.new_a = new_a;
	}

	@Override
	public void resizable() {
		// TODO Auto-generated method stub
		System.out.println("New square with a = " + new_a);
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 4 * new_a;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return new_a * new_a;
	}

}
