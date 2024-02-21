import java.util.Scanner;

public class adamm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double:");
        double number = scanner.nextDouble();

        double base2Log = Math.log(number) / Math.log(2);

        System.out.println("Base 2 log of " + number + " is " + base2Log);

       
    }
}
