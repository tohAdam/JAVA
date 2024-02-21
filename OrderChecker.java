import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        final int BOLT_PRICE = 5;
        final int NUT_PRICE = 3; 
        final int WASHER_PRICE = 1; 

        Scanner scanner = new Scanner(System.in);
      System.out.println("Number of bolts:");
        int bolts = scanner.nextInt();

      System.out.println("Number of nuts:");
        int nuts = scanner.nextInt();

      System.out.println("Number of washers:");
        int washers = scanner.nextInt();
        int totalCost = bolts * BOLT_PRICE + nuts * NUT_PRICE + washers * WASHER_PRICE;
       
      String errorMessage = "";
        if (nuts < bolts) {
            errorMessage = "too few nuts";
        }
        if (washers < 2 * bolts) {
            if (!errorMessage.isEmpty()) {
                errorMessage += " and ";
            }
            errorMessage += "too few washers";
        }
        if (!errorMessage.isEmpty()) {
            System.out.println("Check the Order: " + errorMessage + ".");
        } else {
            System.out.println("Order is OK.");
        }
        System.out.println("Total cost: " + totalCost);
    }
}
