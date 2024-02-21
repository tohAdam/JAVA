import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Enter contestant's weight:");
        int weight = scanner.nextInt();
      
     if (Math.abs(weight - 250) <= 30) {
            System.out.println("Contestant is allowed in the heavyweight division.");
    } 
     else {
            System.out.println("Contestant is not allowed in the heavyweight division.");
        }
    }
}
