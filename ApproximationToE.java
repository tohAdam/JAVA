import java.util.Scanner;

public class ApproximationToE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = scanner.nextDouble();

        double approximationToE = Math.pow(1 + 1 / x, x);

        System.out.printf("Approximation to e: %.7f%n", approximationToE);
    }
}
