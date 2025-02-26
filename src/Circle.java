public class Circle extends Shape {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) throws Exception {
		if(radius <=0 ) throw new Exception("Invalid input! Radius must be positive.");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void printResult() {
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

}
