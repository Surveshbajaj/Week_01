// Class representing an item with details like item code, name, and price
class Item {
    int itemCode; // Unique code for the item
    String itemName; // Name of the item
    double price; // Price of the item

    // Constructor to initialize the item details
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode; // Assign item code
        this.itemName = itemName; // Assign item name
        this.price = price; // Assign item price
    }

    // Method to display the item's details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode); // Display item code
        System.out.println("Item Name: " + itemName); // Display item name
        System.out.println("Price: " + price); // Display item price
    }

    // Method to calculate the total cost based on quantity
    public double calculateTotalCost(int quantity) {
        return quantity * price; // Return total cost (price * quantity)
    }
}

// Main class to demonstrate the functionality of the Item class
public class ItemDetails {
    public static void main(String[] args) {
        // Create an Item object with code, name, and price
        Item item = new Item(101, "Nuts", 5);

        // Display details of the created item
        item.displayDetails();

        // Set the quantity for which total cost needs to be calculated
        int quantity = 5;

        // Calculate and display the total cost for the given quantity
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for quantity " + quantity + ": " + totalCost);
    }
}
