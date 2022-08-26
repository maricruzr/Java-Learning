package java_data_types;

class Phone2 {
	Phone2(){
		System.out.println("this is a phone constructor ");
	}
	Phone2(String name){
		System.out.println("this is a parameterized constructor "+name);
	}
}
class smartPhone1 extends Phone2 {
	smartPhone1(){
		super("john");
		System.out.println("this is a smart phone constructor ");	
	}
}
public class Day19_Super_Method {

	public static void main(String[] args) {
		smartPhone1 a = new smartPhone1();
		
	}

}
