import java.util.Scanner;

public class TrigonometricIdentity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   System.out.println("Input an angle:");
        double angleDegrees = scanner.nextDouble();
        double angleRadians = Math.toRadians(angleDegrees);
        double sinTheta = Math.sin(angleRadians);
        double cosTheta = Math.cos(angleRadians);
        double sinSquared = sinTheta * sinTheta;
        double cosSquared = cosTheta * cosTheta;
        double sum = sinSquared + cosSquared;

    System.out.printf("sin(%.2f)   is:  %.2f%n", angleDegrees, sinTheta);
    System.out.printf("cos(%.2f)   is:  %.2f%n", angleDegrees, cosTheta);
    System.out.printf("sin(%.2f)^2 is:  %.2f%n", angleDegrees, sinSquared);
    System.out.printf("cos(%.2f)^2 is:  %.2f%n", angleDegrees, cosSquared);
    System.out.printf("sum          is:  %.2f%n", sum);
    }
}
