package Game;

import java.util.*;

public class PrimeGame {

	public static int[] getArray(int size) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[size];
		System.out.println("Enter the elements of Array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int[] addArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.println("Added array" + Arrays.toString(arr3));

		return arr3;
	}

	public static int sum(int[] arr3) {
		int sum = 0;
		for (int i = 0; i < arr3.length; i++) {
			sum += arr3[i] % 10;
		}
		System.out.println("Sum=" + sum);
		return sum;
	}

	public static boolean checkPrime(int result) {
		boolean flag = false;
		int count = 0;
		for (int i = 1; i <= result; i++) {
			if (result % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr1;
		int[] arr2;

		System.out.println("Enter the size of first Array");
		int size1 = sc.nextInt();

		if (size1 <= 0) {
			System.out.println("Invalid Size");
			return;
		}

		arr1 = getArray(size1);

		System.out.println("Enter the size of second Array");
		int size2 = sc.nextInt();

		if (size2 <= 0) {
			System.out.println("Invalid Size");
			return;
		}

		if (size1 != size2) {
			System.out.println("Array size not equal");
			return;
		}

		arr2 = getArray(size1);

		int[] arr3 = addArray(arr1, arr2);
		int result = sum(arr3);

		if (checkPrime(result)) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}

	}

}
