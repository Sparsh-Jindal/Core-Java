package magicSum;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {

	static Scanner sc = new Scanner(System.in);

	public static boolean checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}
	
	public static boolean isEqualToSumOfPrime(int n) {
		int sum=0;
		for(int i=2;i<=n;i++) {
			if(checkPrime(i)) {
				sum+=i;
				if(sum==n) {
					return true;
				}
			}
		}
		
		return false;
	}

	public static boolean checkSumPrime(int[] arr) {
		int size = arr.length;
		int count=0;
		for (int i = 0; i < size; i++) {
			if (checkPrime(arr[i])) {
				if(isEqualToSumOfPrime(arr[i])) {
					System.out.println(arr[i]);
					count++;
				}
				 
			}
		}
		if(count==0) {
			System.out.println("The " +size+" numbers are not sum of prime numbers\r\n"
					+ "");
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the array size");
		int size = sc.nextInt();
		if (!(size >= 1 && size <= 5)) {
			System.out.println(size + " is an invalid array");
			return;
		}

		int arr[] = new int[size];   
		System.out.println("Enter the numbers");

		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			if (!(num > 0 && num < 100)) {
				System.out.println(num + " is an invalid input");
				return;
			}
			arr[i] = num;

		}
//		System.out.println("Array=" + Arrays.toString(arr));

		checkSumPrime(arr);
	}

}
