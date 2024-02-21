import java.util.Scanner;

public class Dollars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of cents
        System.out.println("Input the cents:");
        int cents = scanner.nextInt();

        // Calculate the number of dollars and cents
        int dollars = cents / 100;
        int remainingCents = cents % 100;

        // Display the result
        System.out.println("That is " + dollars + " dollars and " + remainingCents + " cents.");

        scanner.close();
    }
}
