// CartItem class models a shopping cart item with basic attributes.
class CartItem {
    // Attributes to hold item name, price, and quantity.
    String itemName;
    int price;
    int quantity;

    // Index to track the current position in the items array.
    int index = 0;

    // Array to hold item names (up to 100 items).
    String[] items = new String[100];

    // Constructor to initialize the item with a name, price, and quantity.
    public CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart.
    // Adds the item to the items array and increments the index.
    public void addItem(String itemName) {
        items[index++] = itemName;
    }

    // Method to remove the last item from the cart.
    // Decreases the index and sets the last position in the array to null.
    public void removeItem() {
        if (index > 0) {
            // Set the last item to null
            items[items.length - 1] = null;
            // Decrease the index to reflect the removal
            index--;
        }
    }

    // Method to calculate the total cost of the items in the cart.
    // It multiplies price and quantity and returns the total.
    public double totalCost() {
        return quantity * price;
    }

    // Method to display the items in the cart.
    // It iterates over the items array and prints each item.
    public void displayResult() {
        // Loop to display each item in the cart (from index 0 to the current index)
        for (int i = 0; i < index; i++) {
            System.out.println("Item: " + items[i]);
        }
    }
}

public class CartItemDetails {
    public static void main(String[] args) {
        // Create a CartItem object named "item" with name "Biscuit", price 10, and quantity 5.
        CartItem item = new CartItem("Biscuit", 10, 5);

        // Add multiple items to the cart using the addItem method.
        item.addItem("Golu");
        item.addItem("Golu");
        item.addItem("Golu");
        item.addItem("Golu");
        item.addItem("Golu");
        item.addItem("Golu");
        item.addItem("Golu");
        item.addItem("mol");

        // Remove the last item from the cart using the removeItem method.
        item.removeItem();

        // Calculate the total cost of the cart items and store it in totalCost.
        double totalCost = item.totalCost();

        // Print the total cost of the items in the cart.
        System.out.println("Total Cost: " + totalCost);

        // Display the list of items in the cart using the displayResult method.
        item.displayResult();
    }
}
