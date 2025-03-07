package passwordValidator;
import java.util.Scanner;
import java.util.regex.*;

class PasswordValidator {
    
    public static boolean isValidPassword(String password) {
        // Regex pattern for password validation
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$*#])[A-Za-z0-9@$*#]{6,12}$";

        // Compile pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Generate your password");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) {
            int lowercaseCount = 0, uppercaseCount = 0, digitCount = 0, specialCharCount = 0;
            String allowedSpecialChars = "@$*#";

            for (char ch : password.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                } else if (allowedSpecialChars.indexOf(ch) != -1) {
                    specialCharCount++;
                }
            }

            System.out.println("The generated password " + password + " is valid and has " + 
                lowercaseCount + " lowercase alphabet " + 
                uppercaseCount + " uppercase alphabet " + 
                specialCharCount + " special character " + 
                digitCount + " digit");
        } else {
            System.out.println(password + " is an invalid password");
        }

        scanner.close();
    }
}
