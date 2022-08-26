package java_data_types;

public class Day08_Do_WhileLoop {

	public static void main(String[] args) {
		
		int a = 0;
		do {
			System.out.println("hello");
			a++;
		} while(a<5);
		
		// break example
		
		int b=0;
		do {
			System.out.println("hello");
			if(b==5) {
				System.out.println("the value is 5");
				break;
			}
			b++;
		}while(b<=15);
		

	}

}
