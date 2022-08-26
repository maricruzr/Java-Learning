package java_data_types;

abstract class furniture {
	abstract void color(); // abstract methods
	abstract void material();
	abstract void weight();
}
 abstract class chair extends furniture {
	void color() {
		System.out.println("this is a color method ");
	}
	void material() {
		System.out.println("this is a material method ");	
	}	
	abstract void dimension();
}

 class brand extends chair {
	void dimension() {
		System.out.println("this is a dimension method ");
	}
	void weight() {
		System.out.println("this is a weight method ");	
	}
 }
public class Day20_Abstract_Class {

	public static void main(String[] args) {
		brand b = new brand();
		b.color();
		b.dimension();
		b.material();
		b.weight();

	}

}
