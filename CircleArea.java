import java.util.Scanner;

public class adamm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the radius: ");
        int radius = scanner.nextInt();

        double area = Math.PI * radius * radius;

        System.out.println("The radius is: " + radius);
        System.out.println("The area is: " + area);

   
    }
}
