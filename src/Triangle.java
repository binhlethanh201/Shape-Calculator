
public class Triangle extends Shape{
	private double sideA, sideB, sideC;

	public Triangle() {
	}

	public Triangle(double sideA, double sideB, double sideC) throws Exception {
		if( sideA + sideB > sideC && sideA + sideC > sideB && sideC+sideB > sideA) {
			this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		}
		else throw new Exception("Invalid input! The given sides do not form a valid triangle.");
		
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		if(sideA > 0) this.sideA = sideA;
	
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		if(sideB > 0) this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		if(sideC > 0)  this.sideC = sideC;
	}

	@Override
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p - sideA) * (p - sideB) * (p - sideC));
	}

	@Override
	public void printResult() {
		System.out.println("Side A: " + sideA);
		System.out.println("Side B: " + sideB);
		System.out.println("Side C: " + sideC);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
	
}
