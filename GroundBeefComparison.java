import java.util.Scanner;

public class GroundBeefComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Price per pound package A:");
        double pricePerPoundA = scanner.nextDouble();

        System.out.println("Percent lean package A:");
        int percentLeanA = scanner.nextInt();

    System.out.println("Price per pound package B:");
        double pricePerPoundB = scanner.nextDouble();

    System.out.println("Percent lean package B:");
        int percentLeanB = scanner.nextInt();
        double costPerPoundLeanA = pricePerPoundA / (percentLeanA / 100.0);
        double costPerPoundLeanB = pricePerPoundB / (percentLeanB / 100.0);


    String bestValuePackage;
       if (costPerPoundLeanA < costPerPoundLeanB) {
            bestValuePackage = "Package A";
        } 
       else {
            bestValuePackage = "Package B";
        }

        System.out.println("Package A cost per pound of lean: " + costPerPoundLeanA);
        System.out.println("Package B cost per pound of lean: " + costPerPoundLeanB);
        System.out.println(bestValuePackage + " is the best value");
    }
}
