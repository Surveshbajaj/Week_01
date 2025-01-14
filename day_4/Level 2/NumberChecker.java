import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero"; // In case the number is zero
        }
    }

    // Method to check if a number is even or odd
    public String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater
        } else if (num1 < num2) {
            return -1; // num1 is less
        } else {
            return 0; // num1 is equal to num2
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberChecker obj = new NumberChecker();

        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Checking each number if it's positive or negative, and even or odd for positive numbers
        for (int i = 0; i < numbers.length; i++) {
            String positivity = obj.isPositive(numbers[i]);
            if (positivity.equals("positive")) {
                System.out.println(numbers[i] + " is positive and " + obj.isEven(numbers[i]) + ".");
            } else if (positivity.equals("negative")) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Comparing the first and last elements of the array
        int comparisonResult = obj.compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == -1) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element is equal to the last element.");
        }

        input.close();
    }
}
