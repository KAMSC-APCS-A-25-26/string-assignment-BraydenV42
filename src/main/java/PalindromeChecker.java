import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner and read a full line from the user
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        scanner.close();

        // Create a lowercase version for comparison
        String lower = original.toLowerCase();

        // Manually reverse the lowercase string
        String reversed = "";
        for (int i = lower.length() - 1; i >= 0; i--) {
            reversed += lower.charAt(i);
        }

        // Check if the string is a palindrome
        if (lower.equals(reversed)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
