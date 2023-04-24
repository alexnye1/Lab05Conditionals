import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        double shippingCost;
        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = 0.02 * itemPrice;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.printf("Shipping cost: $%.2f\n",shippingCost = 0.02 * itemPrice );
        System.out.printf("Total price: $%.2f\n", totalPrice);

        scanner.close();
    }
}