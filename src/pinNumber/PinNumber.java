package pinNumber;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PinNumber {
	static Scanner sc = new Scanner(System.in);

	public static boolean isValidPin(String pin) {
		String regex = "^[13579][24680][2357][4689]$";
		return pin.matches("\\d{4}") && Pattern.matches(regex, pin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the total number of PIN numbers");
		int n = sc.nextInt();
		sc.nextLine();
		if (n <= 0) {
			System.out.println(n + " is an invalid number");
			return;
		}
		int count = 0;
		boolean check = false;
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter the PIN numbers");
		for (int i = 0; i < n; i++) {
			String pin = sc.nextLine();
			if (!pin.matches("\\d{4}")) {
				System.out.println(pin + " is an invalid PIN number ");
			} else {
				if (isValidPin(pin)) {
					sb.append(pin).append("\n");
					check = true;
					count++;
				}
			}

		}
		if (check) {
			if (count > 1) {
				System.out.println("Valid PIN numbers are");
				System.out.println(sb);
			} else {
				System.out.println("Valid PIN number is");
				System.out.println(sb);
			}

		} else {
			System.out.println("All these " + n + " numbers are not a valid PIN number");
		}

	}

}
