import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the price of the purchase: ");
        double purchasePrice = scanner.nextDouble();


        double salesTax = purchasePrice * 0.05;


        double totalPrice = purchasePrice + salesTax;


        System.out.println("Sales tax: $" + salesTax);
        System.out.println("Total price (including tax): $" + totalPrice);

        // Close the scanner
        scanner.close();
    }
}
