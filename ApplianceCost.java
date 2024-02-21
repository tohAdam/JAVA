import java.util.Scanner;

public class ApplianceCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cost per kilowatt-hour in cents:");
        double costPerKWh = scanner.nextDouble();

        System.out.println("Enter kilowatt-hours used per year:");
        double kWhPerYear = scanner.nextDouble();
        double annualCost = costPerKWh * kWhPerYear / 100; 
        System.out.println("Annual cost: " + annualCost);
    }
}
