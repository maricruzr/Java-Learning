package java_data_types;

public class Day25_MoreStrings2 {

	public static void main(String[] args) {

		// using .toCharArray() method
		String name = "Hello World";
		char[] characters = name.toCharArray(); // {'h','e','l','l','o',' ','w','o','r','l','d'}
		System.out.println(characters.length);
		for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}

		// using .split() method
		String sentence = "Hello today we are learning more Strings.";
		String[] words = sentence.split(" "); // {'Hello','today','we'...
		for (int i = 0; i < words.length; i++) {
			// system.out.println(words[i]); **remove this to convert toCharArray**
			String word = words[i]; // step 1 to convert toCharArray
			char[] characs = word.toCharArray(); // converting
			for (int j = 0; j < characs.length; j++) { // making loop
				System.out.println(characs[j]); // printing
			}
			System.out.println("***************"); // to separate each loop
		}
		// or second way to do also
		char[] ch = sentence.toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			System.out.println("");
		}
		

	}
}
