package java_data_types;

public class Day30_ArrayReview {

	public static void main(String[] args) {
		String country_name ="USA";
		System.out.println(country_name);
		char character ='c';
		System.out.println(character);
		int age = 25;
		System.out.println(age);
		
		String[] countries = {"USA","Canada","China","UAE"};
		for(String country : countries) {
			System.out.println(country);
		}
		
		char[] alphabets = {'a','b','c','d','e'};
		for(char alphabet : alphabets) {
			System.out.println(alphabet);
		}
		
		int[] ages = {20,25,22,34};
		for(int a :ages) {
			System.out.println(a);
		}
	}

}
