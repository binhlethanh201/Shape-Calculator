
public class Rectangle extends Shape {
	private double width, length;

	public Rectangle() {

	}

	public Rectangle(double width, double length) throws Exception {
		if(width <=0 || length <=0) throw new Exception("Invalid input! Width and height must be positive.");
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public void printResult() {
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

}
