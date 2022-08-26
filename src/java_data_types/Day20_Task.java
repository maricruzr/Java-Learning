package java_data_types;

abstract class crystals {
	abstract void shape();
	abstract void type();
}
abstract class candles extends crystals {
	void shape() {
		System.out.println("the shape will be hearts ");
	}
	void type() {
		System.out.println("the type of crystals will be quarts ");
	}
	abstract void size();
		
}
class shop extends candles {
	void size() {
		System.out.println("the size will be small ");
	}
}
public class Day20_Task {

	public static void main(String[] args) {
		shop s = new shop();
		s.shape();
		s.size();
		s.type();

	}

}
