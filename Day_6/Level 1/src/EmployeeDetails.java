// Class representing an Employee with name, ID, and salary details
class Employee {
    String name; // Employee's name
    int id; // Employee's ID
    double salary; // Employee's salary

    // Constructor to initialize Employee's details
    public Employee(String name, int id, double salary) {
        this.name = name; // Assign name
        this.id = id; // Assign ID
        this.salary = salary; // Assign salary
    }

    // Method to display the employee's details
    public void displayDetails() {
        System.out.println("Name: " + name); // Display the employee's name
        System.out.println("ID: " + id); // Display the employee's ID
        System.out.println("Salary: " + salary); // Display the employee's salary
    }
}

// Main class to test the Employee class
public class EmployeeDetails {
    public static void main(String[] args) {
        // Create an Employee object with name, ID, and salary
        Employee employee1 = new Employee("Rajesh", 1, 2000);
        // Display the details of the created employee
        employee1.displayDetails();
    }
}
