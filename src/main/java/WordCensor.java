import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // Read a full sentence from the user
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        String censored = "";
        int i = 0;

        while (i < sentence.length()) {
            // Check for each banned word starting at position i
            if (i + 4 <= sentence.length() && sentence.substring(i, i + 4).equals("dang")) {
                censored += "***";
                i += 4;
            } else if (i + 4 <= sentence.length() && sentence.substring(i, i + 4).equals("nuts")) {
                censored += "***";
                i += 4;
            } else if (i + 4 <= sentence.length() && sentence.substring(i, i + 4).equals("oops")) {
                censored += "***";
                i += 4;
            } else if (i + 5 <= sentence.length() && sentence.substring(i, i + 5).equals("yikes")) {
                censored += "***";
                i += 5;
            } else {
                // Copy current character as-is
                censored += sentence.charAt(i);
                i++;
            }
        }

        System.out.println("Censored: " + censored);
    }
}