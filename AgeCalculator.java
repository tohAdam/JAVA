import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  System.out.println("Year of Birth:");
        int birthYear = scanner.nextInt();

  System.out.println("Current year:");
        int currentYear = scanner.nextInt();
        int century = (currentYear - birthYear >= 0) ? 1900 : 2000;
        int age = currentYear - (century + birthYear);
      
  System.out.println("Your age: " + age);
    }
}
