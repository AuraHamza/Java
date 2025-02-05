package RETIAL;
import java.util.Scanner;

public class MAIN {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Item item = new Item();

            // Set item details
            item.itemName = "Laptop";
            item.itemID = 101;
            item.setPrice(500.0);
            item.setStock(10);

            // Search for an item
            System.out.print("Enter item name or ID to search: ");
            String name = sc.next();
            int id = sc.nextInt();

            if (item.search(name, id)) {
                System.out.println("Item found!");
                item.displayItem();
            } else {
                System.out.println("Item not found.");
                return;
            }

            // Purchase item
            System.out.print("Enter quantity to purchase: ");
            int quantity = sc.nextInt();
            item.purchaseItem(quantity);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////

package RETIAL;

public class Item {

        public String itemName;
        public int itemID;
        private double price;
        private int stock;

        // Setter methods
        public void setPrice(double p) {
            if (p > 0) {
                price = p;
            } else {
                System.out.println("Price must be greater than 0.");
            }
        }

        public void setStock(int s) {
            if (s >= 0) {
                stock = s;
            } else {
                System.out.println("Stock cannot be negative.");
            }
        }

        // Getter methods
        public double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        // Display item details
        public void displayItem() {
            System.out.println("Item ID: " + itemID);
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Stock: " + stock);
        }

        // Search by name or ID
        public boolean search(String name, int id) {
            return (itemName.equalsIgnoreCase(name) || itemID == id);
        }

        // Purchase method
        public void purchaseItem(int quantity) {
            if (quantity > stock) {
                System.out.println("Not enough stock available.");
            } else {
                stock -= quantity;
                double totalBill = quantity * price;
                System.out.println("Purchase successful!");
                System.out.println("Total Bill: $" + totalBill);
                System.out.println("Remaining Stock: " + stock);
            }
        }
    }



