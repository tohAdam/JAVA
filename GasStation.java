import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   System.out.println("Tank capacity:");
        int tankCapacity = scanner.nextInt();

   System.out.println("Gage reading:");
        int gaugeReading = scanner.nextInt();

   System.out.println("Miles per gallon:");
        int milesPerGallon = scanner.nextInt();
        int remainingMiles = gaugeReading * tankCapacity * milesPerGallon / 100;
        
      if (remainingMiles >= 200) {
            System.out.println("Safe to Proceed");
        } else {
            System.out.println("Get Gas!");
        }
    }
}
