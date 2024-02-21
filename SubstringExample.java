import java.util.Scanner;

public class SubstringExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String originalString = scanner.nextLine();

       
        System.out.println("Enter beginning index:");
        int beginIndex = scanner.nextInt();

      
        System.out.println("Enter ending index:");
        int endIndex = scanner.nextInt();

      
        String newString = originalString.substring(beginIndex, endIndex);

      
        System.out.println("\nOriginal string:");
        System.out.println(originalString);

        System.out.println("\nSubstring:");
        System.out.println(newString);

     
    }
}
