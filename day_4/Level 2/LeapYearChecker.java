import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if the year is a leap year
    public boolean isLeapYear(int year) {
        if (year >= 1582) {
        
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;  // Return false if the year is before 1582
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LeapYearChecker obj = new LeapYearChecker();

        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year 
        if (obj.isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}
