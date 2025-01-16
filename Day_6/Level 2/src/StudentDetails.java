// Class representing a student with details and grade calculation
class Student {
    // Fields to store the name, roll number, and marks of the student
    String name; // Name of the student
    int rollNumber; // Unique roll number of the student
    double marks; // Marks scored by the student

    // Constructor to initialize the student details
    Student(String name, int rollNumber, double marks) {
        this.name = name; // Assign the student's name
        this.rollNumber = rollNumber; // Assign the student's roll number
        this.marks = marks; // Assign the student's marks
    }

    // Method to calculate the grade based on the marks
    public char calculateGrade() {
        // Determine the grade according to the marks
        if (marks >= 90) {
            return 'A'; // Grade A for marks 90 and above
        } else if (marks >= 80) {
            return 'B'; // Grade B for marks between 80 and 89
        } else if (marks >= 70) {
            return 'C'; // Grade C for marks between 70 and 79
        } else if (marks >= 60) {
            return 'D'; // Grade D for marks between 60 and 69
        } else {
            return 'F'; // Grade F for marks below 60
        }
    }

    // Method to display the student's details along with the grade
    public void displayDetails() {
        char grade = calculateGrade(); // Calculate the grade
        System.out.println("Name: " + name); // Display the student's name
        System.out.println("Roll No.: " + rollNumber); // Display the roll number
        System.out.println("Marks: " + marks); // Display the marks
        System.out.println("Grade: " + grade); // Display the calculated grade
    }
}

// Main class to demonstrate the functionality of the Student class
public class StudentDetails {
    public static void main(String[] args) {
        // Create a Student object with name, roll number, and marks
        Student student1 = new Student("Pradeep", 38, 90);
        student1.displayDetails(); // Display details for the first student

        // Create another Student object with name, roll number, and marks
        Student student2 = new Student("Shivraj", 175, 84);
        student2.displayDetails(); // Display details for the second student
    }
}
