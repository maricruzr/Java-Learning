package java_data_types;

import java.util.ArrayList;
import java.util.Collections;

public class Day31_ArrayList {

	public static void main(String[] args) {
		//ArrayList keeps duplicates and maintains the insertion order
		
		
		//to create ArrayList
		ArrayList<String> names = new ArrayList<String>();
		// .add
		names.add("John");
		names.add("Mike");
		names.add("Steve");
		names.add("Mike");
		System.out.println(names);
		names.add("Chris");
		System.out.println(names);
		names.add(0, "Maricruz");
		System.out.println(names);
		//.remove
		names.remove(1);
		System.out.println(names);
		names.remove("Mike");
		System.out.println(names);
		//.set
		names.set(1, "John");
		System.out.println(names);
		
		//.indexOf
		int indexOfChris = names.indexOf("Chris");
		System.out.println(indexOfChris);
		
		System.out.println(names.indexOf("Chris"));
		
		names.set(indexOfChris, "Chris Freeman");
		
		System.out.println(names);
		
		System.out.println("after sorting the results ");
		
		Collections.sort(names);
		System.out.println(names);
		
		String name = names.get(2);
		System.out.println(name);
		
		System.out.println(names.size());
		boolean present = names.contains("Steve");
		System.out.println(present);
		
		//names.clear();
		System.out.println(names);
		
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
			
		}
		//try print the values present in the names object using advanced loop
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("using while loop ");
		int i=0;
		while(i<names.size())
		{
			System.out.println(names.get(i));
			i++;
		}
		
		System.out.println("using do while loop");
		int j=0;
		do {
			System.out.println("inside do while loop");
			System.out.println(names.get(j));
			j++;
		}while(j<names.size());
		
		
		
		

	}

}
