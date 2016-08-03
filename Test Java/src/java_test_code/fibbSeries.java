package java_test_code;

import java.util.Scanner;

public class fibbSeries {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter the limit of fibb series:: ");
		int count = s1.nextInt();

		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
