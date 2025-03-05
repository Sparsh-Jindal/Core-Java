package arrayManipulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
	public static String getDublicateElement() {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the size of an array");
			int size = sc.nextInt();
			if (size < 1) {
				throw new NegativeArraySizeException();
			}

			System.out.println("Enter the array elements");
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("Enter the position of the array to be replicated");
			int pos = sc.nextInt();
			if (pos < 0 || pos >= size) {
				throw new ArrayIndexOutOfBoundsException();
			}

			StringBuilder result = new StringBuilder("The array elements are");

			for (int num : arr) {
				result.append(' ').append(num);
			}
			result.append(' ').append(arr[pos]);

			return result.toString();

		} catch (NegativeArraySizeException e) {
			return ("Array size should be positive");
		} catch (ArrayIndexOutOfBoundsException e) {
			return ("Array index is out of range");
		} catch (InputMismatchException e) {
			return ("Input was not in correct format");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDublicateElement());
	}

}
