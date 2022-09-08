package java_data_types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Day32_HashSet {
	// HashSet does not contain duplicates and does not have an insertion order
	// ArrayList keeps duplicates and maintains the insertion order

	public static void main(String[] args) {
		HashSet<Integer> roll_numbers = new HashSet<Integer>();
		roll_numbers.add(100);
		roll_numbers.add(200);
		roll_numbers.add(300);
		roll_numbers.add(200);
		roll_numbers.add(400);
		roll_numbers.add(400);
		roll_numbers.add(300);
		System.out.println(roll_numbers);

		// HashSet to Array
		System.out.println("HashSet to Array***");
		Integer[] rollNum = new Integer[roll_numbers.size()];
		roll_numbers.toArray(rollNum);
		System.out.println(rollNum.length);
		
		//advanced loop
		for (Integer a : rollNum) {
			System.out.println(a);
		}
		System.out.println("HashSet to Array***");

		// HashSet to ArrayList
		ArrayList<Integer> roll_numbers_al = new ArrayList<Integer>(roll_numbers);
		roll_numbers_al.add(400);
		roll_numbers_al.add(400);
		roll_numbers_al.add(400);
		roll_numbers_al.add(300);
		System.out.println("using ArrayList and adding to it");
		System.out.println(roll_numbers_al);

		// advanced loop
		System.out.println("using the loop");
		for (Integer i : roll_numbers) {
			System.out.println(i);
		}
		// iterator
		System.out.println("using iterator");
		Iterator<Integer> rn = roll_numbers.iterator();
		while (rn.hasNext()) {
			System.out.println(rn.next());
		}
		System.out.println(roll_numbers);

		// .clone
		Object roll_numbers_clone = roll_numbers.clone();
		System.out.println(roll_numbers_clone);

		// .contains
		Boolean present = roll_numbers.contains(2001); // true or false
		System.out.println(present);

		// .remove
		System.out.println(roll_numbers.size());
		roll_numbers.remove(400);
		System.out.println(roll_numbers);

		// .clear
		roll_numbers.clear();

		// .isEmpty
		System.out.println(roll_numbers.isEmpty());// true or false

	}

}
