package java_test_code;

import java.util.Scanner;

public class duplicatesInString {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check :");
		original = in.nextLine();
		System.out.println("Entered String is:" + original);

		int length = original.length();

		for (int i = 0; i < original.length(); i++) {
			int count = 0;
			// char ch=original.charAt(i);
			for (int j = 0; j < original.length(); j++) {

				if (j < i && original.charAt(j) == original.charAt(i)) {
					break;
				}
				if (original.charAt(i) == original.charAt(j)) {
					count++;
				}
			}
			if (count > 0)
				System.out.println("Number of occurence of character ch: " + original.charAt(i) + " are: " + count);

		}

	}

}
