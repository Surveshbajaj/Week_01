// Class representing a circle with methods to calculate area and circumference
class Circle {
    double radius; // Radius of the circle

    // Constructor to initialize the radius of the circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double areaOfCircle() {
        return Math.PI * (radius * radius); // Formula: π * r^2
    }

    // Method to calculate the circumference of the circle
    public double circumferenceOfTheCircle() {
        return (2 * Math.PI) * radius; // Formula: 2 * π * r
    }

    // Method to display the area and circumference of the circle
    public void displayDetails() {
        System.out.println("Area of Circle: " + areaOfCircle());
        System.out.println("Circumference of The Circle: " + circumferenceOfTheCircle());
    }
}

// Main class to test the Circle class
public class CircleDetails {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5); // Create a Circle object with a radius of 5.5
        circle1.displayDetails(); // Display the area and circumference of the circle
    }
}
