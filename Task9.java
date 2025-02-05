package retailstore;

public class Main {

    public static void main(String[] args) {
        double[] productPrices = RetailStoreDiscount.getProductPricesFromUser();

        RetailStoreDiscount.applyDiscountAndDisplayPrices(productPrices);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
package retailstore;

import java.util.Scanner;

public class RetailStoreDiscount {

    public static void applyDiscountAndDisplayPrices(double[] prices) {
        System.out.println("Original Prices and Discounted Prices: ");

        for (int i = 0; i < prices.length; i++) {
            double originalPrice = prices[i];
            double discountedPrice = originalPrice - (originalPrice * 0.10); // 10% discount
            System.out.printf("Original Price: %.2f, Discounted Price: %.2f%n", originalPrice, discountedPrice);
        }
    }

    public static double[] getProductPricesFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int numProducts = scanner.nextInt();

        double[] prices = new double[numProducts];

        System.out.println("Enter the prices of " + numProducts + " products:");
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Price of product " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
        }

        return prices;
    }
}
