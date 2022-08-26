package java_data_types;

public class Day26_MoreStrings {

	public static void main(String[] args) {
		String a = "hello";
		String b =a+ "world";
		System.out.println(b);
		
		StringBuffer aa = new StringBuffer("hello");
		//aa.append(" ");
		aa.append("world");
		//aa.append(" ");
		aa.append("today we are learning String Buffer ");
		System.out.println(aa);
		aa.insert(5, ' ');
		System.out.println(aa);
		aa.insert(11, ',');
		System.out.println(aa);
		aa.insert(0, "good evening,");
		System.out.println(aa);
		aa.insert(13, ' ');
		System.out.println(aa);
		aa.insert(26, ' ');
		System.out.println(aa);
		aa.reverse();
		System.out.println(aa);
		aa.reverse();
		System.out.println(aa);
		aa.delete(12, 25);
		System.out.println(aa);
		aa.deleteCharAt(12);
		System.out.println(aa);
		aa.replace(5, 12, "morning");
		System.out.println(aa);
		
	

	}

}
