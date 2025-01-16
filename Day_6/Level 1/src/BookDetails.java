// Class representing a book with basic details
class Book {
    // Fields to store the title, author, and price of the book
    String title; // The title of the book
    String author; // The author of the book
    double price; // The price of the book

    // Constructor to initialize the book's details
    Book(String title, String author, double price) {
        this.title = title; // Assign the book title
        this.author = author; // Assign the author's name
        this.price = price; // Assign the price of the book
    }

    // Method to display the book's details
    public void displayDetails() {
        System.out.println("Book title: " + title); // Display the book title
        System.out.println("Author name: " + author); // Display the author's name
        System.out.println("Price: " + price); // Display the book price
    }
}

// Main class to demonstrate the functionality of the Book class
public class BookDetails {
    public static void main(String[] args) {
        // Create a Book object with initial details
        Book book1 = new Book("Pride and Prejudice", "Jane Austen", 20);

        // Display the details of the book
        book1.displayDetails();
    }
}
