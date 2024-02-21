import java.util.Scanner;

public class DepositValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   System.out.println("Initial deposit:");
        double P = scanner.nextDouble();

   System.out.println("Interest rate:");
        double r = scanner.nextDouble();

   System.out.println("Times per year:");
        double n = scanner.nextDouble();

        System.out.println("Number of years:");
        double t = scanner.nextDouble();
        double V = P * Math.pow(1 + r / n, n * t);
  System.out.printf("Value: $%.2f%n", V);
    }
}
