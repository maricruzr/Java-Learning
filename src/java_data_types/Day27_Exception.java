package java_data_types;

import java.util.Scanner;

public class Day27_Exception {

	public static void main(String[] args) {
		System.out.println("program started");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter the value of a ");
			int a = sc.nextInt();
			System.out.println("the value of a is "+a);
			System.out.println("enter the value of b ");
			int b = sc.nextInt();
			System.out.println("the value of b is "+b);
			int c = a/b;
			System.out.println("the division is "+c);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
