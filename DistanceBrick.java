import java.util.Scanner;

public class FallingBrick {
    public static void main(String[] args) {
        final double g = 32.174;
        Scanner scanner = new Scanner(System.in);
       
      System.out.println("Enter the number of seconds:");
        double t = scanner.nextDouble();
        double d = 0.5 * g * t * t;
       
      System.out.println("Distance: " + d);
    }
}
