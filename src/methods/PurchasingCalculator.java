
package methods;

import java.util.Scanner;

public class PurchasingCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter item price: ");
        final double ITEM_PRICE = reader.nextDouble();
        
        System.out.println("Enter discount:");
        double discount = reader.nextDouble();
        if(discount >= 1) {
            discount = discount / 100;
        }
        
        System.out.println("Enter tax rate: ");
        double taxRate = reader.nextDouble();
        if(taxRate >= 1) {
            taxRate = taxRate / 100;
        }
        
        System.out.println("Enter spending limit: ");
        final double SPENDING_LIMIT = reader.nextDouble();
        
        System.out.println("Hard-coded discount: " + (int) (discount * 100) + "%");
        
        System.out.println("Price after discount: $" + computePriceAfterDiscount(ITEM_PRICE, discount));
        
        System.out.println("Total price after tax: $" + displayPriceWithTax(computePriceAfterDiscount(ITEM_PRICE, discount), taxRate));
        
        System.out.println("With $" + SPENDING_LIMIT + ", you can buy " 
                + displayPurchasableNumber(displayPriceWithTax(ITEM_PRICE, taxRate), SPENDING_LIMIT)
                + " units.");
        
        
        
    }
    
    public static double displayPriceWithTax(double price, double rate) {
        
        double finalPrice = price * (1 + rate);
        
        return finalPrice;
    }
    
    public static double computePriceAfterDiscount(double price, double discount) {
        
        final double FINAL_PRICE = (price - (price * discount));
        
        return FINAL_PRICE;
    }
    
    public static int displayPurchasableNumber(double price, double limit) {
        int numPurchasable = (int) Math.floor(limit / price);
        
        return numPurchasable;
    }
}
