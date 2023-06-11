import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the total cost of your item?: ");
        double purchasePrice = scanner.nextDouble();

        double salesTax = purchasePrice * 0.05;

        double totalPrice = purchasePrice + salesTax;

        System.out.println("Total item tax: $" + salesTax);
        System.out.println("Final price (including tax): $" + totalPrice);

        scanner.close();
    }
}
