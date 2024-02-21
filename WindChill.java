import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
      System.out.println("Enter Wind Speed:");
        double windSpeed = scanner.nextDouble();

      System.out.println("Enter Temperature:");
        double temperature = scanner.nextDouble();
        double windChill;
    
      if (windSpeed < 3 || temperature > 50) {
            windChill = temperature;
        } 
      else {
            windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        }
        System.out.println("Wind Chill: " + windChill);
    }
}
