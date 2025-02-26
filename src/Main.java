import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);

	private static double checkInputDouble() {
		while (true) {
			double in = Double.parseDouble(sc.nextLine().trim());
			if (in > 0) return in;
			else {
				System.err.println("Must be positive");
				System.out.print("Please input again: ");
			}

		}
	}

	public static void main(String[] args) throws Exception {
		double h, w, r, a, b, c;

		// Input Shape
		System.out.println("===== Calculator Shape Program =====");
		System.out.println("Please input side width of Rectangle: ");
		w = checkInputDouble();
		System.out.println("Please input height of Rectangle: ");
		h = checkInputDouble();
		System.out.println("Please input radius of Circle: ");
		r = checkInputDouble();
		System.out.println("Please input side A of Triangle: ");
		a = checkInputDouble();
		System.out.println("Please input side B of Triangle: ");
		b = checkInputDouble();
		System.out.println("Please input side C of Triangle: ");
		c = checkInputDouble();

		Rectangle rec = new Rectangle(w, h);
		Circle ci = new Circle(r);
		Triangle tri = new Triangle(a, b, c);

		// Print results
		System.out.println("----- Rectangle -----");
		rec.printResult();
		System.out.println("----- Circle -----");
		ci.printResult();
		System.out.println("----- Triangle -----");
		tri.printResult();

		sc.close();
	}
}
