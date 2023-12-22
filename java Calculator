import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform addition
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Perform subtraction
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Perform multiplication
        double product = num1 * num2;
        System.out.println("Product: " + product);

        // Perform division
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}
