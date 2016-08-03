package java_test_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class five_ImmutableList {

	public static void main(String[] args) {
		// create array list
		List<Character> list = new ArrayList<Character>();

		// populate the list
		list.add('X');
		list.add('Y');

		System.out.println("Initial list: " + list);

		list.add('A');
		System.out.println("Initial list: " + list);
		// make the list unmodifiable
		List<Character> immutablelist = Collections.unmodifiableList(list);

		// try to modify the list
		immutablelist.add('Z');

	}

}
