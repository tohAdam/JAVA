import java.util.Scanner;

public class DoubleMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
      System.out.println("Enter the annual interest rate:");
        double interestRate = scanner.nextDouble();
        double yearsToDouble = 72.0 / interestRate;
    
     System.out.printf("Number of years to double: %.1f%n", yearsToDouble);
    }
}
