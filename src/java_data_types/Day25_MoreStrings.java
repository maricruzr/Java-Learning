package java_data_types;

public class Day25_MoreStrings {

	public static void main(String[] args) {
		String words = "!0@J#1#m$2%O%3^i&4*H(5)k_6+N7e8";
		System.out.println("before removing anthing :" +words);
		
		String noNumbers = words.replaceAll("[0-9]", "");
		System.out.println("after removing [0-9] : " +noNumbers);
		
		String noUpperCase = words.replaceAll("[A-Z]", "");
		System.out.println("after removing [A-Z] : "+noUpperCase);
		
		String noLowerCase = words.replaceAll("[a-z]", "");
		System.out.println("after removing [a-z] : "+noLowerCase);
		
		String onlySpecialCharacters = words.replaceAll("[A-Za-z0-9]", "");
		System.out.println("shows only special characters : "+onlySpecialCharacters);
		
		String showNumbersOnly = words.replaceAll("[^0-9]", "");
		System.out.println("to only show [0-9] : "+showNumbersOnly);
		
		String showUpperCaseOnly = words.replaceAll("[^A-Z]", "");
		System.out.println("to only show [A-Z]: "+showUpperCaseOnly);
		
		String showLowerCaseOnly = words.replaceAll("[^a-z]", "");
		System.out.println("to only show [a-z]: "+showLowerCaseOnly);
	

	}

}
