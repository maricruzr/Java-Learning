package java_data_types;

public class Day23_Strings {

	public static void main(String[] args) {
		String topic = new String(" what is the topic we are learning today ? ");
		int len = topic.length();
		System.out.println(len);
		
		String name =" JOHN ";
		String lastname = " king";
		System.out.println(" this will print the length of name variable : " +name.length());
		System.out.println(" this will print the name variable : "+name);
		String lowerName = name.toLowerCase();
		System.out.println("this will convert the name variable to lowercase : "+lowerName);
		System.out.println(topic.toUpperCase());
		// name JOHN
		// lowerName john
		System.out.println(" using equalsignorecase : " +name.equalsIgnoreCase(lowerName));
		System.out.println(" using equalsignorecase : "+name.equalsIgnoreCase(lastname));
		System.out.println(" using equals method : "+name.equals(lastname));
		System.out.println(" using comparedTo method : "+name.compareTo(lastname));
		System.out.println(" using comparedToIgnorecase method : "+name.compareToIgnoreCase(lastname));
		
		// if the value is 0 we print the value is 0 if value is negative print value is negative if vale is positive print
		// the value is positive using fname and lname
		
		String fName = " Maricruz ";
		String lName = " Ortiz ";
		int v = fName.compareToIgnoreCase(lName);
		if(v == 0) {
			System.out.println(" the value is 0 ");
		}else if(v > 0) {
			System.out.println(" the value is positive ");
		}else if(v < 0) {
			System.out.println(" the value is negative ");
		}else {
			System.out.println("error occured ");
		}
		System.out.println(v);
	}

}
