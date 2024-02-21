import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      System.out.println("Enter X:");
        double X = scanner.nextDouble();
        
      System.out.println("Enter Y:");
        double Y = scanner.nextDouble();
        double arithmeticMean = (X + Y) / 2;
        double harmonicMean = 2 / (1/X + 1/Y);

      System.out.println("Arithmetic mean: " + arithmeticMean);
      System.out.println("Harmonic   mean: " + harmonicMean);
    }
}
