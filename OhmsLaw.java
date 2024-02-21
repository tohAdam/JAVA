import java.util.Scanner;

public class adamm{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the voltage (in volts):");
        int voltage = scanner.nextInt();

        System.out.println("Enter the resistance (in ohms):");
        int resistance = scanner.nextInt();

        double current = (voltage + 0.0) / resistance;
        
        System.out.println("The current flowing through the device is: " + current + " amps");

        scanner.close();
    }
}
