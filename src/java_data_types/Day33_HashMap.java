package java_data_types;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Day33_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> info = new HashMap<String, String>();
		info.put("name", "Maricruz");
		info.put("car", "Ford");
		info.put("state", "Virginia");
		info.put("city", "Woodbridge");
		info.put("city", "Woodbridge1");
		info.put("city", "Woodbridge2");
		System.out.println(info);
		// convert into set
		Set<Entry<String, String>> information = info.entrySet();
		// iterating
		Iterator<Entry<String, String>> it = information.iterator();
		// loop
		while (it.hasNext()) {
			// System.out.println(it.next());
			Entry<String, String> singleMap = it.next();
			System.out.println(singleMap.getKey());
			System.out.println(singleMap.getValue());
		}
		// task create a HashMap and use int as a key and string as value and store
		// different values print key value pairs using iterator
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		data.put(123, "hello");
		data.put(435, "world");
		data.put(543, "happy");
		data.put(347, "day");
		System.out.println(data);
		Set<Entry<Integer, String>> da = data.entrySet();
		Iterator<Entry<Integer, String>> d = da.iterator();
		while (d.hasNext()) {
			System.out.println(d.next());
		}
		// .clone
		Object cloneOfData = data.clone();
		System.out.println("cloned : " + cloneOfData);
		// .containsKey
		System.out.println(data.containsKey(123));// true
		// .containsValue
		System.out.println(data.containsValue("hello"));// true
		// .get
		System.out.println(data.get(123));
		// .isEmpty
		System.out.println(data.isEmpty());// false
		//.KeySet
		System.out.println(data.keySet());
		//.values
		System.out.println(data.values());
		//.size
		System.out.println(data.size());
		//.remove
		data.remove(435);
		System.out.println(data);
		//.putAll
		HashMap<Integer, String> moredata = new HashMap<Integer, String>();
		moredata.putAll(data);
		System.out.println("****");
		System.out.println(moredata);
		// .clear
		data.clear();
		System.out.println(data);
		// .isEmpty
		System.out.println(data.isEmpty());// true

	}

}
