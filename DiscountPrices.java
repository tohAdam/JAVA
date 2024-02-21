import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.println("Enter amount of purchases:");
        int purchaseAmount = scanner.nextInt();

        if (purchaseAmount > 1000) {
            int discountedPrice = purchaseAmount - (purchaseAmount / 10);
            System.out.println("Discounted price: " + discountedPrice);
        } else {
            System.out.println("No discount applied. Purchase amount: " + purchaseAmount);
        }
    }
}
