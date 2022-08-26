package java_data_types;

public class Day24_MoreStrings {

	public static void main(String[] args) {
		
		// how to use .concat() method
		String fname= "Maricruz ";
		String lname= "Ortiz";
		String fullname = fname.concat(lname);
		System.out.println(fullname);
		
		// how to use .trim() method
		String day = "   today we are learning Strings  ";
		System.out.println("before using trim :" +day);
		day = day.trim();
		 System.out.println("after using trim :" +day);
		if(day.equals("today we are learning Strings")) {
			System.out.println("yayy, the String value matched ! ");
		}else {
			System.out.println("the value does not match ");
		}
		
		// how to use .startsWith() method 
		String transaction = "$50.00";
		boolean dollarSymbol= transaction.startsWith("$");
		if(dollarSymbol) {
			System.out.println("the prefix is present");
		} else {
			System.out.println("it is not present ");
		}
		
		// how to use .endsWith() method 
		boolean stringPresent = day.endsWith("Strings");
		System.out.println(stringPresent);
		
		// how to use .charAt() method
		char ret = transaction.charAt(0);
		System.out.println(ret);
		
		// how to use .indexOf() method
		System.out.println(transaction.indexOf('5'));
		String email = "hello123@gmail.com";
		System.out.println(email.indexOf('@'));
		
		// how to use .substring() method and substring() with 2 parameters
		System.out.println(email.substring(8));
		System.out.println(email.substring(0, 8));
		
		// how to use .replace() method
		String title = "welcome the the dealer$hip";
		title=title.replace('$', 's');
		System.out.println(title);
		
		Day24_MoreStrings t = new Day24_MoreStrings();
		method("maricruzz");
		method1("maricruz");
		System.out.println(t.method2("maricruz", "ortiz"));
	}
	//task
	
	public static void method(String a) {
		if(a.length() >=3) {
			if(a.length() % 2 == 1) {
				int index = a.length()/2;
				System.out.println(a.charAt(index));
			}else {
				System.out.println("value enterred is either even number of characters, or is less than 3 characters ");
			}
		}
		
	}
	public static void method1(String a) {
		if(a.length()>= 5) {
			if(a.length() % 2 == 0) {
				int index = a.length()/2;
				System.out.println(a.substring( index-1, index+1));
			}else {
				System.out.println("value enterred is either odd number of characters, or is less than 5 characters ");
			}
		}
		
	}
	boolean method2(String actualValue, String expectedValue) {
		boolean answer = actualValue.equalsIgnoreCase(expectedValue);
		return answer ;
	}

}
