package java_data_types;

abstract class Shape {
	abstract int RectangleArea(int lenght, int width);
	abstract int SquareArea(int side);
	abstract double CircleArea(double radius);
}

class Area extends Shape {
	int RectangleArea(int length, int width) {
		int b = length*width;
		return b;
	}
	int SquareArea(int side) {
		int c = side*side;
		return c;
	}
	double CircleArea(double radius) {
		double d = 2*3.14*radius;
		return d;
	}
}
public class Day22_Shape_Task {

	public static void main(String[] args) {
		Shape a = new Area();
		System.out.println(a.RectangleArea(5, 7));
		System.out.println(a.SquareArea(9));
		System.out.println(a.CircleArea(3));
	}

}
