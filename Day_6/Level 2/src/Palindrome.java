// Class to check if a given text is a palindrome
class PalindromeChecker {
    String text; // Input text to check for palindrome

    // Constructor to initialize the text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean checkPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        // Compare characters from both ends
        while (left <= right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // Return false if mismatch occurs
            }
            left++;
            right--;
        }
        return true; // Return true if no mismatches found
    }

    // Method to display whether the text is a palindrome
    public void displayResult() {
        if (checkPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

// Main class to test the PalindromeChecker
public class Palindrome {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("rjj");
        checker1.displayResult(); // Display result for the given text
    }
}
