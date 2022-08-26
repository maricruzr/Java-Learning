package java_data_types;

import java.util.Scanner;

public class Day18_Task {

	public static void main(String[] args) {
		Scanner takeInput = new Scanner(System.in);
		System.out.println("how many values would you like to calculate ? ");
		int vals = takeInput.nextInt();
		int[] arr = new int[vals];
		System.out.println("what operator would you like to use? ");
		char op = takeInput.next().charAt(0);
		
		for(int a=0; a<vals;a++) {
			System.out.println("enter the "+(a+1)+ "value");
			arr[a]= takeInput.nextInt();
		}
		
		

	}

}
