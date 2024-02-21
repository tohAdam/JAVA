import java.util.Scanner;

public class adamm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of change due (in cents):");
        int changeDue = scanner.nextInt();

        int dollars = changeDue / 100;
        int remainingChange = changeDue % 100;

        int quarters = remainingChange / 25;
        remainingChange %= 25;

        int dimes = remainingChange / 10;
        remainingChange %= 10;

        int nickels = remainingChange / 5;
        remainingChange %= 5;

        int pennies = remainingChange;

        
        System.out.println("Your change is:");
        System.out.println(dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + pennies + " penny/pennies.");

    }
}
