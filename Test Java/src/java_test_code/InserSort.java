package java_test_code;
import java.util.Scanner;

public class InserSort {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		System.out.println("Please enter the no. of items you want to enter");
		int t = s1.nextInt();

		int[] arr = new int[t];

		System.out.println("Please enter " + t + " integers to sort:");

		for (int i = 0; i < t; i++) {
			arr[i] = s2.nextInt();

		}
		System.out.println("You have entered following values: ");

		for (int j = 0; j < t; j++) {
			System.out.println("Value at index [" + j + "] is " + arr[j]);

		}
		inSort(arr);
		System.out.println("Sorted Array is:: ");
		for (int j = 0; j < t; j++) {
			System.out.println("Value at index [" + j + "] is " + arr[j]);
		}
	}

	public static int[] inSort(int[] arr) {
		int temp;

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}

		}
		return arr;

	}

}
