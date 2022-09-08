package java_data_types;

import java.util.ArrayList;
import java.util.Iterator;

public class Day32_Interator {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Audi");
		cars.add("Bmw");
		cars.add("Merc");
		cars.add("Toyota");
		cars.add("Honda");
		System.out.println(cars);
		
		Iterator<String>car = cars.iterator();
		
		while(car.hasNext()) {
			System.out.println(car.next());
		}
		
		//task create an ArrayList of students roll number and iterate through each roll number and print them in console
		
		ArrayList<Integer> rollnum = new ArrayList<Integer>();
		rollnum.add(1234);
		rollnum.add(1354);
		rollnum.add(2584);
		rollnum.add(3054);
		rollnum.add(7854);
		rollnum.add(9985);
		System.out.println(rollnum);
		Iterator<Integer> rollnumber = rollnum.iterator();
		while(rollnumber.hasNext()) {
			System.out.println(rollnumber.next());
		}

	}

}
