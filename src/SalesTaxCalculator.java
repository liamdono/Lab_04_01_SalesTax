import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of the purchase
        System.out.print("Enter the price of the purchase: ");
        double purchasePrice = scanner.nextDouble();

        // Calculate the sales tax (5% of the purchase price)
        double salesTax = purchasePrice * 0.05;

        // Compute the total price including sales tax
        double totalPrice = purchasePrice + salesTax;

        // Output the sales tax and the total price
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("Total price (including tax): $" + totalPrice);

        // Close the scanner
        scanner.close();
    }
}
