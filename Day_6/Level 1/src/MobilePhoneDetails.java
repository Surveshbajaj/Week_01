// Class representing a mobile phone with brand, model, and price details
class MobilePhone {
    String brand; // Brand of the mobile phone
    String model; // Model of the mobile phone
    double price; // Price of the mobile phone

    // Constructor to initialize the mobile phone details
    MobilePhone(String brand, String model, double price) {
        this.brand = brand; // Assign brand
        this.model = model; // Assign model
        this.price = price; // Assign price
    }

    // Method to display the details of the mobile phone
    public void displayDetails() {
        System.out.println("Brand: " + brand); // Display the brand of the phone
        System.out.println("Model: " + model); // Display the model of the phone
        System.out.println("Price: " + price); // Display the price of the phone
    }
}

// Main class to demonstrate the functionality of the MobilePhone class
public class MobilePhoneDetails {
    public static void main(String[] args) {
        // Create a MobilePhone object with brand, model, and price
        MobilePhone phone1 = new MobilePhone("One Plus", "Node CE 4", 20000);

        // Display the details of the created mobile phone
        phone1.displayDetails();
    }
}
